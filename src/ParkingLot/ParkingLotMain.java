package ParkingLot;

import ParkingLot.Controller.InitController;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Repository.*;
import ParkingLot.Service.InitialisationService;

public class ParkingLotMain {

    public static void main(String[] args) {
        GateRepository gateRepository= new GateRepository();
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository=new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository=new ParkingFloorRepository();
        TicketRepository ticketRepository=new TicketRepository();

        InitialisationService initialisationService=new InitialisationService(gateRepository,parkingLotRepository,parkingFloorRepository,parkingSpotRepository);
        InitController initController=new InitController(initialisationService);
        initController.init();
    }
}
