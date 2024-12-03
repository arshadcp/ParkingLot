package ParkingLot.Service.Strategies.SpotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSlotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
