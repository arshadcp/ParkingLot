package ParkingLot.Model;

import ParkingLot.Model.ennum.ParkingLotStatus;

import java.util.List;

public class ParkingLot extends BaseClass {

        private String name;
        private String address;
        private List<ParkingFloor> Floors;
        private List<Vehicle> VehicleSupported;
        private ParkingLotStatus parkinglotStatus;
      //  private List<Gate> gates;

}
