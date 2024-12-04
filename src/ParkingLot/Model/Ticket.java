package ParkingLot.Model;

import java.time.LocalDateTime;

public class Ticket extends  BaseClass{

  private ParkingSpot parkingSpot;
  private LocalDateTime Entrytime;
    private Vehicle vehicle;
    private Gate Entrygate;

  public Ticket(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, ParkingSpot parkingSpot, LocalDateTime entrytime, Vehicle vehicle, Gate entrygate) {
    super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
    this.parkingSpot = parkingSpot;
    Entrytime = entrytime;
    this.vehicle = vehicle;
    Entrygate = entrygate;
  }

  @Override
  public String toString() {
    return "Ticket{" +
            "parkingSpot=" + parkingSpot +
            ", Entrytime=" + Entrytime +
            ", vehicle=" + vehicle +
            ", Entrygate=" + Entrygate +
            ", id=" + id +
            '}';
  }

  public Ticket(){

  }

  public ParkingSpot getParkingSpot() {
    return parkingSpot;
  }

  public void setParkingSpot(ParkingSpot parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

  public LocalDateTime getEntrytime() {
    return Entrytime;
  }

  public void setEntrytime(LocalDateTime entrytime) {
    Entrytime = entrytime;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Gate getEntrygate() {
    return Entrygate;
  }

  public void setEntrygate(Gate entrygate) {
    Entrygate = entrygate;
  }
}
