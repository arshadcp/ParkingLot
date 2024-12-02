package ParkingLot.Repository;

import ParkingLot.Exceptions.ParkingFloorNotFoundException;
import ParkingLot.Exceptions.ParkingSpotNotAvailableException;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingSpot;

import java.util.HashMap;

public class ParkingFloorRepository {

    private HashMap<Integer, ParkingFloor> hmfloor;


    public ParkingFloorRepository() {
        this.hmfloor=new HashMap<>();
    }

    public ParkingFloor getParkingfloor(int parkingfloorId){
        if(hmfloor.containsKey(parkingfloorId)){
            return  hmfloor.get(parkingfloorId);

        }
        throw new ParkingFloorNotFoundException("Parking floor not found for id: "+parkingfloorId);
    }
    public void addParkingFloor(ParkingFloor parkingfloor){
        hmfloor.put(parkingfloor.getId(),parkingfloor);
    }
}
