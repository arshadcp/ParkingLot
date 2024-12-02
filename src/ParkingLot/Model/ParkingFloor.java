package ParkingLot.Model;

import ParkingLot.Model.ennum.ParkingFloorStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseClass{
    private int FloorNumber;
    private List<ParkingSpot> Spot;
    private Gate Entrygate;
    private Gate Exitgate;
    private ParkingFloorStatus floorStatus;

    public ParkingFloor(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, int floorNumber, List<ParkingSpot> spot, Gate entrygate, Gate exitgate, ParkingFloorStatus floorStatus) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        FloorNumber = floorNumber;
        Spot = spot;
        Entrygate = entrygate;
        Exitgate = exitgate;
        this.floorStatus = floorStatus;
    }
    public ParkingFloor(){

    }

    public Gate getEntrygate() {
        return Entrygate;
    }

    public void setEntrygate(Gate entrygate) {
        Entrygate = entrygate;
    }

    public Gate getExitgate() {
        return Exitgate;
    }

    public void setExitgate(Gate exitgate) {
        Exitgate = exitgate;
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


    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
