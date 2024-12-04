package ParkingLot.Repository;

import ParkingLot.Exceptions.BillNotFoundException;
import ParkingLot.Exceptions.TicketNotFoundException;
import ParkingLot.Model.Bill;
import ParkingLot.Model.Ticket;

import java.util.HashMap;

public class BillRepository {
    private HashMap<Integer, Bill> hmbill;
    //private static int idCounter=0;


    public BillRepository() {
        this.hmbill=new HashMap<>();
    }

    public Bill getBill(int billId){
        if(hmbill.containsKey(billId)){
            return hmbill.get(billId);

        }
        throw new BillNotFoundException("Bill not found for id: "+billId);
    }



    public void add(Bill bill){
      //  ticket.setId(++idCounter);
        hmbill.put(bill.getId(),bill);
        System.out.println("bill is added successfully");

    }
}


