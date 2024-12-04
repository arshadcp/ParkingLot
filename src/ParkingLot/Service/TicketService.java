package ParkingLot.Service;

import ParkingLot.Model.*;
import ParkingLot.Model.ennum.ParkingSpotStatus;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.ParkingSpotRepository;
import ParkingLot.Repository.TicketRepository;
import ParkingLot.Service.Strategies.SpotAllocationStrategy.SpotAllocationStrategy;
import ParkingLot.Service.Strategies.SpotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {
    TicketRepository ticketRepository;
   GateRepository gateRepository;
   ParkingLotRepository parkingLotRepository;
   ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository=parkingSpotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int parkingLotId, int gateId){
        Ticket ticket=new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntrytime(LocalDateTime.now());

        ParkingLot parkingLot=parkingLotRepository.getParkingLot(parkingLotId);
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingSpot allocatedSpot=strategy.getParkingSpotForVehicle(parkingLot,vehicle);
        ticket.setParkingSpot(allocatedSpot);

        allocatedSpot.setVehicle(vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
       parkingSpotRepository.addParkingSpot(allocatedSpot);

        ticket.setEntrygate(gateRepository.getGate(gateId));
        return ticketRepository.add(ticket);

    }
}
