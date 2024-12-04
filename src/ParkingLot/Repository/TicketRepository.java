package ParkingLot.Repository;

import ParkingLot.Exceptions.ParkingSpotNotAvailableException;
import ParkingLot.Exceptions.TicketNotFoundException;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Ticket;

import java.util.HashMap;

public class TicketRepository {

    private HashMap<Integer, Ticket> hmticket;
    private static int idCounter=0;


    public TicketRepository() {
        this.hmticket=new HashMap<>();
    }

    public Ticket getTicket(int ticketId){
        if(hmticket.containsKey(ticketId)){
            return  hmticket.get(ticketId);

        }
        throw new TicketNotFoundException("Ticket not found for id: "+ticketId);
    }



    public Ticket add(Ticket ticket){
       ticket.setId(++idCounter);
        hmticket.put(ticket.getId(),ticket);
        System.out.println("ticket is added successfully");
        return hmticket.get(idCounter);
    }
}
