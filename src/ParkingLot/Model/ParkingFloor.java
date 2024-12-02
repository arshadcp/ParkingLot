package ParkingLot.Model;

import ParkingLot.Model.ennum.ParkingFloorStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseClass{
    private int FloorNumber;
    private List<ParkingSpot> Spot;
    private List<Gate> gate;
    private ParkingFloorStatus floorStatus;

    public ParkingFloor(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, int floorNumber, List<ParkingSpot> spot, List<Gate> gate, ParkingFloorStatus floorStatus) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        FloorNumber = floorNumber;
        Spot = spot;
        this.gate = gate;
        this.floorStatus = floorStatus;
        gate=new ArrayList<>();
        Spot=new ArrayList<>();
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public List<ParkingSpot> getSpot() {
        return Spot;
    }

    public void setSpot(List<ParkingSpot> spot) {
        Spot = spot;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
