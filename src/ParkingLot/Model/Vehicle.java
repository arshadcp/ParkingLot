package ParkingLot.Model;

import ParkingLot.Model.ennum.VehicleType;

import java.time.LocalDateTime;

public class Vehicle extends BaseClass{

   private String vehicleNumber;
   private VehicleType vehicleType;



   public Vehicle(){

   }

   public Vehicle(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, String vehicleNumber, VehicleType vehicleType) {
      super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
      this.vehicleNumber = vehicleNumber;
      this.vehicleType = vehicleType;
   }

   @Override
   public String toString() {
      return "Vehicle{" +
              "vehicleNumber='" + vehicleNumber + '\'' +
              ", vehicleType=" + vehicleType +
              ", id=" + id +
              '}';
   }

   public String getVehicleNumber() {
      return vehicleNumber;
   }

   public void setVehicleNumber(String vehicleNumber) {
      this.vehicleNumber = vehicleNumber;
   }

   public VehicleType getVehicleType() {
      return vehicleType;
   }

   public void setVehicleType(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
   }
}
