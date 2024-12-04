package ParkingLot;

import ParkingLot.Controller.InitController;
import ParkingLot.Controller.TicketController;
import ParkingLot.Model.Gate;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.Vehicle;
import ParkingLot.Model.ennum.GateStatus;
import ParkingLot.Model.ennum.VehicleType;
import ParkingLot.Repository.*;
import ParkingLot.Service.InitialisationService;
import ParkingLot.Service.Strategies.TicketService;

import java.util.Scanner;

public class ParkingLotMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GateRepository gateRepository= new GateRepository();
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository=new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository=new ParkingFloorRepository();


        InitialisationService initialisationService=new InitialisationService(gateRepository,parkingLotRepository,parkingFloorRepository,parkingSpotRepository);
        InitController initController=new InitController(initialisationService);
        initController.init();

        //ticket
        TicketRepository ticketRepository=new TicketRepository();
        TicketService ticketService=new TicketService(ticketRepository,
                gateRepository,parkingLotRepository,parkingSpotRepository);
        TicketController ticketController=new TicketController(ticketService);

        Vehicle vehicle=new Vehicle();
        Gate gate=new Gate();
        System.out.println("Please choose an option 1:enter 2:exit");
        int option=sc.nextInt();
        if(option==1) {
            System.out.println("Please enter the Vehicle details");
            System.out.println("Please enter the vehicle number");
            String number = sc.next();
            vehicle.setVehicleNumber(number);
            System.out.println("Please enter the vehicle type 1:CAR 2:BIKE");
            int type = sc.nextInt();
            if (type == 1) {
                vehicle.setVehicleType(VehicleType.CAR);
            } else {
                vehicle.setVehicleType(VehicleType.Bike);
            }
            System.out.println("Please enter the parkingLotID");
            int parkingLotId = sc.nextInt();
            System.out.println("Please enter the gateId");
            int gateId = sc.nextInt();
            gate.setId(gateId);
            gate.setGateStatus(GateStatus.OPEN);
            Ticket ticket = ticketController.generateTicket(vehicle, gateId, parkingLotId);
            System.out.println("Ticket details "+ticket);
        }else{

        }




    }
}
