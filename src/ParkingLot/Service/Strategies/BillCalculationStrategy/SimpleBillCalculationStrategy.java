package ParkingLot.Service.Strategies.BillCalculationStrategy;

import ParkingLot.Model.Bill;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.ennum.BillStatus;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy{
    public Bill generateBill(Ticket ticket){
        LocalDateTime entrytime=ticket.getEntrytime();
        LocalDateTime exittime=LocalDateTime.now();
        long numberOfSeconds= ChronoUnit.SECONDS.between(exittime,entrytime);
        long amount=numberOfSeconds*1;
        Bill bill=new Bill();
        bill.setAmount(amount);
        bill.setTicket(ticket);
        bill.setBillStatus(BillStatus.UNPAID);
        bill.setId(exittime.hashCode());
        bill.setExittime(exittime);
        return bill;
    }
}
