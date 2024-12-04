package ParkingLot.Model;

import ParkingLot.Model.ennum.ParkingSpotStatus;
import ParkingLot.Model.ennum.ParkingSpotType;
import ParkingLot.Model.ennum.VehicleType;

import java.time.LocalDateTime;

public class ParkingSpot extends BaseClass{
    private int SpotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingSpotType parkingSpotType;
    private VehicleType vehicleType;
    private Vehicle vehicle;

    public ParkingSpot(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, int spotNumber, ParkingSpotStatus parkingSpotStatus, ParkingSpotType parkingSpotType, VehicleType vehicleType, Vehicle vehicle) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        SpotNumber = spotNumber;
        this.parkingSpotStatus = parkingSpotStatus;
        this.parkingSpotType = parkingSpotType;
        this.vehicleType = vehicleType;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "SpotNumber=" + SpotNumber +
                ", parkingSpotStatus=" + parkingSpotStatus +
                ", parkingSpotType=" + parkingSpotType +
                ", vehicleType=" + vehicleType +
                ", vehicle=" + vehicle +
                ", id=" + id +
                '}';
    }

    public ParkingSpot(){

    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpotNumber() {
        return SpotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        SpotNumber = spotNumber;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
