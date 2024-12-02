package ParkingLot.Repository;

import ParkingLot.Exceptions.GateNotFoundException;
import ParkingLot.Exceptions.TicketNotFoundException;
import ParkingLot.Model.Gate;
import ParkingLot.Model.Ticket;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> hmgate;


    public GateRepository() {
        this.hmgate=new HashMap<>();
    }

    public Gate getGate(int gateId){
        if(hmgate.containsKey(gateId)){
            return  hmgate.get(gateId);

        }
        throw new GateNotFoundException("Gate not found for id: "+gateId);
    }
    public void addgate(Gate gate){
        hmgate.put(gate.getId(),gate);
    }
}
