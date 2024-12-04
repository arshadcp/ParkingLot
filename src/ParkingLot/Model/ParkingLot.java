package ParkingLot.Model;

import ParkingLot.Model.ennum.ParkingLotStatus;
import ParkingLot.Model.ennum.VehicleType;
import ParkingLot.Service.Strategies.BillCalculationStrategy.BillCalculationStrategy;
import ParkingLot.Service.Strategies.SpotAllocationStrategy.SpotAllocationStrategy;
import ParkingLot.Service.Strategies.SpotAllocationStrategy.SpotAllocationStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLot extends BaseClass {

        private String name;
        private int capacity;
        private String address;
        private List<ParkingFloor> Floors;
        private List<VehicleType> vehicleTypeSupported;
        private ParkingLotStatus parkinglotStatus;
        private BillCalculationStrategy billAllocationStrategy;
        private SpotAllocationStrategy spotAllocationStrategy;


        public ParkingLot(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, String name, int capacity, String address, List<ParkingFloor> floors, List<VehicleType> vehicleTypeSupported, ParkingLotStatus parkinglotStatus, BillCalculationStrategy billAllocationStrategy, SpotAllocationStrategy spotAllocationStrategy) {
                super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
                this.name = name;
                this.capacity = capacity;
                this.address = address;
                Floors = floors;
                this.vehicleTypeSupported = vehicleTypeSupported;
                this.parkinglotStatus = parkinglotStatus;
                this.billAllocationStrategy = billAllocationStrategy;
                this.spotAllocationStrategy = spotAllocationStrategy;
        }

        public ParkingLot(){

        }

        public List<VehicleType> getVehicleTypeSupported() {
                return vehicleTypeSupported;
        }

        public void setVehicleTypeSupported(List<VehicleType> vehicleTypeSupported) {
                this.vehicleTypeSupported = vehicleTypeSupported;
        }

        public BillCalculationStrategy getBillAllocationStrategy() {
                return billAllocationStrategy;
        }

        public void setBillAllocationStrategy(BillCalculationStrategy billAllocationStrategy) {
                this.billAllocationStrategy = billAllocationStrategy;
        }

        public SpotAllocationStrategy getSpotAllocationStrategy() {
                return spotAllocationStrategy;
        }

        public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
        }

        public int getCapacity() {
                return capacity;
        }

        public void setCapacity(int capacity) {
                this.capacity = capacity;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public List<ParkingFloor> getFloors() {
                return Floors;
        }

        public void setFloors(List<ParkingFloor> floors) {
                Floors = floors;
        }




        public ParkingLotStatus getParkinglotStatus() {
                return parkinglotStatus;
        }

        public void setParkinglotStatus(ParkingLotStatus parkinglotStatus) {
                this.parkinglotStatus = parkinglotStatus;

        }
}
