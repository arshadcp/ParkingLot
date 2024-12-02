package ParkingLot.Model;

import ParkingLot.Model.ennum.ParkingSpotStatus;
import ParkingLot.Model.ennum.ParkingSpotType;

import java.time.LocalDateTime;

public class ParkingSpot extends BaseClass{
    private int SpotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingSpotType parkingSpotType;

    public ParkingSpot(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, int spotNumber, ParkingSpotStatus parkingSpotStatus, ParkingSpotType parkingSpotType) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        SpotNumber = spotNumber;
        this.parkingSpotStatus = parkingSpotStatus;
        this.parkingSpotType = parkingSpotType;
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
