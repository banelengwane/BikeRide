package bike;

import bicycles.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {
    @Test
    public void shouldTestASingleMountainBikeRide(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRide(mountainBike);
        mBikeRide.ride();
        assertEquals(14, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldTestASingleRoadBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeRide = new BikeRide(roadBike);

        rBikeRide.ride();
        assertEquals(36, rBikeRide.currentSpeed());
    }

    @Test
    public void shouldTestASingleTendemRide(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRide = new BikeRide(tandemBike);

        bikeRide.ride();
        assertEquals(34, bikeRide.currentSpeed());
    }

}
