package ParkingLot.Service.Strategies.SpotAllocationStrategy;

import ParkingLot.Exceptions.ParkingSpotNotAvailableException;
import ParkingLot.Exceptions.ParkingSpotNotFoundException;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingLot;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Vehicle;
import ParkingLot.Model.ennum.ParkingSpotStatus;
import ParkingLot.Model.ennum.VehicleType;
import ParkingLot.Service.Strategies.SpotAllocationStrategy.SpotAllocationStrategy;

import java.util.ArrayList;
import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy {
   public ParkingSpot getParkingSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle){
        List<ParkingFloor> floors=parkingLot.getFloors();
        for(ParkingFloor f:floors){
            List<ParkingSpot> sp=f.getSpot();
            for(ParkingSpot s:sp){
                if(s.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                        && s.getVehicleType().equals(vehicle.getVehicleType())){
                    return s;
                }
            }

        }
        throw new ParkingSpotNotFoundException("go home");
    }
}
