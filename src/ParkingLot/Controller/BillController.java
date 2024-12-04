package ParkingLot.Controller;

import ParkingLot.Model.Bill;
import ParkingLot.Service.BillService;

public class BillController {
    BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public Bill generateBill(int ticketId,int exitGateId){
        return billService.generateBill( ticketId,exitGateId);
    }
}
