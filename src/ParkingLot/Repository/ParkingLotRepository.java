package ParkingLot.Repository;

import ParkingLot.Exceptions.ParkingFloorNotFoundException;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {

   private HashMap<Integer, ParkingLot> hmLot;


   public ParkingLotRepository() {
      this.hmLot=new HashMap<>();
   }

   public ParkingLot getParkingLot(int parkingLotId){
      if(hmLot.containsKey(parkingLotId)){
         return  hmLot.get(parkingLotId));

      }
      throw new ParkingFloorNotFoundException("Parking floor not found for id: "+parkingLotId));
   }
   public void setParkingFloor(ParkingLot parkingLot){
      hmLot.put(parkingLot.getId(),parkingLot);
   }
}
