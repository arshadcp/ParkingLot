package ParkingLot.Repository;

import ParkingLot.Exceptions.ParkingSpotNotAvailableException;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.ennum.ParkingSpotStatus;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingSpotRepository {

    private HashMap<Integer,ParkingSpot> hmspot;


    public ParkingSpotRepository() {
        this.hmspot=new HashMap<>();
    }

    public ParkingSpot getParkingSpot(int parkingSpotId){
       if(hmspot.containsKey(parkingSpotId)){
         return  hmspot.get(parkingSpotId);

       }
        throw new ParkingSpotNotAvailableException("Parking spot not found for id: "+parkingSpotId);
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        hmspot.put(parkingSpot.getId(),parkingSpot);
    }
}
