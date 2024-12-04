package ParkingLot.Repository;

import ParkingLot.Exceptions.ParkingFloorNotFoundException;
import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {

   private HashMap<Integer, ParkingLot> hmLot;
   private static int idCounter=0;


   public ParkingLotRepository() {
      this.hmLot=new HashMap<>();
   }

   public ParkingLot getParkingLot(int parkingLotId){
      if(hmLot.containsKey(parkingLotId)){
         return  hmLot.get(parkingLotId);

      }
      throw new ParkingFloorNotFoundException("ParkingLot not found for id: "+parkingLotId);
   }
   public void addParkingLot(ParkingLot parkingLot){
      parkingLot.setId(++idCounter);
      hmLot.put(parkingLot.getId(),parkingLot);
   }
}
