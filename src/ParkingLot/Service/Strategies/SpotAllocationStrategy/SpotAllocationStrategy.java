package ParkingLot.Service.Strategies.SpotAllocationStrategy;

import ParkingLot.Model.ParkingLot;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Vehicle;

public interface SpotAllocationStrategy {
   ParkingSpot getParkingSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle);
}
