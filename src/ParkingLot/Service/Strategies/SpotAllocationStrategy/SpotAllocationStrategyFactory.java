package ParkingLot.Service.Strategies.SpotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
