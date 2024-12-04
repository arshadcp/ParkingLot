package ParkingLot.Model;

import ParkingLot.Model.ennum.GateStatus;
import ParkingLot.Model.ennum.GateType;

import java.time.LocalDateTime;

public class Gate extends BaseClass {
    private int gateNumber;
    private GateType gateType;
    private GateStatus gateStatus;
    private String guardname;

    public Gate(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, int gateNumber, GateType gateType, GateStatus gateStatus, String guardname) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.guardname = guardname;
    }

  //  @Override
//    public String toString() {
//        return "Gate{" +
//                "gateNumber=" + gateNumber +
//                ", gateType=" + gateType +
//                ", gateStatus=" + gateStatus +
//                ", guardname='" + guardname + '\'' +
//                ", id=" + id +
//                '}';
//    }

    public Gate(){

    }

    public GateType getGateType() {
        return gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getGuardname() {
        return guardname;
    }

    public void setGuardname(String guardname) {
        this.guardname = guardname;
    }
}
