package ParkingLot.Service.Strategies.BillCalculationStrategy;

import ParkingLot.Model.Bill;
import ParkingLot.Model.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
