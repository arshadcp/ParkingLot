package ParkingLot.Service;

import ParkingLot.Model.Bill;
import ParkingLot.Model.Gate;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.ennum.BillStatus;
import ParkingLot.Model.ennum.ParkingSpotStatus;
import ParkingLot.Repository.BillRepository;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.TicketRepository;
import ParkingLot.Service.Strategies.BillCalculationStrategy.BillCalculationFactory;
import ParkingLot.Service.Strategies.BillCalculationStrategy.BillCalculationStrategy;

import java.time.LocalDateTime;

public class BillService {
    BillRepository billRepository;
    TicketRepository ticketRepository;
    ParkingLotRepository parkingLotRepository;
    GateRepository gateRepository;
    public Bill generateBill(int ticketId,int exitGateId){
        Bill bill=new Bill();
        bill.setBillStatus(BillStatus.UNPAID);
       // bill.setExittime(LocalDateTime.now());
        Ticket ticket=ticketRepository.getTicket(ticketId);
        bill.setTicket(ticket);

       // ParkingLot parkinglot= parkingLotRepository.getParkingLot(parkingLotId);
       BillCalculationStrategy strategy= BillCalculationFactory.getBillCalculationStrategy();
       bill.setAmount(strategy.generateBill(ticket).getAmount());

       Gate gate=gateRepository.getGate(exitGateId);
       bill.setExitgate(gate);

        ParkingSpot parkingspot=ticket.getParkingSpot();
       parkingspot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
       billRepository.add(bill);
       return billRepository.getBill(bill.getId());
    }
}
