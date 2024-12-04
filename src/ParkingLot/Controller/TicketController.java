package ParkingLot.Controller;

import ParkingLot.Model.Gate;
import ParkingLot.Model.ParkingLot;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.Vehicle;
import ParkingLot.Service.Strategies.TicketService;

public class TicketController {
    TicketService ticketService;


    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public Ticket generateTicket( Vehicle vehicle, int parkingLotId,int gateId){
       return ticketService.generateTicket(vehicle,parkingLotId,gateId);
    }
}
