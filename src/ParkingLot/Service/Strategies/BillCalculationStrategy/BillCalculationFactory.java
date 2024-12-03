package ParkingLot.Service.Strategies.BillCalculationStrategy;

import ParkingLot.Model.Ticket;

public class BillCalculationFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(){
        return new SimpleBillCalculationStrategy();
    }
}
