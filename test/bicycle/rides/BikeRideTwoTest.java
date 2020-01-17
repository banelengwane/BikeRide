package bicycle.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {
    @Test
    public void shouldTestBikeRideTwoUsingMountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride();
        assertEquals(44, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldTestBikeRideTwoUsingRoadBike(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeRide = new BikeRideTwo(roadBike);

        rBikeRide.ride();
        assertEquals(102, rBikeRide.currentSpeed());
    }

    @Test
    public void shouldTestBikeRideTwoUsingTandemBike(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRide = new BikeRideTwo(tandemBike);

        bikeRide.ride();
        assertEquals(106, bikeRide.currentSpeed());
    }
}
