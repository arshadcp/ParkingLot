package ParkingLot.Service;

import ParkingLot.Model.*;
import ParkingLot.Model.ennum.*;
import ParkingLot.Repository.*;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
 private   GateRepository gateRepository;
    private  ParkingLotRepository parkingLotRepository;
    private   ParkingFloorRepository parkingFloorRepository;
    private  ParkingSpotRepository parkingSpotRepository;
    private TicketRepository ticketRepository;

    public InitialisationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.ticketRepository = ticketRepository;
    }

  public void init(){
        System.out.println("Starting Initialisation");
        ParkingLot parkinglot= new ParkingLot();
        parkinglot.setName("Madiwala parking");
        parkinglot.setAddress("prestige");

        ArrayList<VehicleType>v=new ArrayList<>();

        v.add(VehicleType.CAR);
        v.add(VehicleType.Bike);
         parkinglot.setVehicleTypeSupported(v);
         parkinglot.setCapacity(100);
         parkinglot.setParkinglotStatus(ParkingLotStatus.OPEN);


         // parkinglot have floors
      ArrayList<ParkingFloor>fls=new ArrayList<>();
     for(int i=0;i<10;i++){
            ParkingFloor parkingfloor=new ParkingFloor();//each floor have a new floor object
            parkingfloor.setFloorNumber(i);
            parkingfloor.setId(i*10+1);
            parkingfloor.setFloorStatus(ParkingFloorStatus.OPEN);


        //floor contain spots
        ArrayList<ParkingSpot>ps=new ArrayList<>();
        for(int j=0;j<10;j++){
            ParkingSpot parkingspot=new ParkingSpot();
            parkingspot.setSpotNumber(i*100+1);
            parkingspot.setId(j);
            parkingspot.setVehicleType(VehicleType.CAR);
            parkingspot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
            //parkingspot.setVehicle(ve);
            parkingspot.setParkingSpotType(ParkingSpotType.FOUR_WHEELER);
            ps.add(parkingspot);
            parkingSpotRepository.addParkingSpot(parkingspot);
        }

        parkingfloor.setSpot(ps);//adding spots to list in floor(floor class)
        //parking floor have gates-list of gates


         Gate Entrygate=new Gate();
        Entrygate.setGateNumber(i*300+1);
         Entrygate.setGateStatus(GateStatus.OPEN);
         Entrygate.setGateType(GateType.ENTRY_GATE);
         Entrygate.setId(i*500+1);
         Entrygate.setGuardname("Entrygate guard");

         parkingfloor.setEntrygate(Entrygate);

         Gate Exitgate=new Gate();
         Exitgate.setGateNumber(i*200+1);
         Exitgate.setGateStatus(GateStatus.OPEN);
         Exitgate.setGateType(GateType.EXIT_GATE);
         Exitgate.setId(i*100+1);
         Exitgate.setGuardname("exitgate guard");
         parkingfloor.setExitgate(Exitgate);

         gateRepository.addgate(Exitgate);
         gateRepository.addgate(Entrygate);


         parkingFloorRepository.addParkingFloor(parkingfloor);
         fls.add(parkingfloor);
        parkinglot.setFloors(fls);//adding floors to lot class
         parkingLotRepository.addParkingLot(parkinglot);
        //return parkingLotRepository.getParkingLot(1);
    }
  }
}
