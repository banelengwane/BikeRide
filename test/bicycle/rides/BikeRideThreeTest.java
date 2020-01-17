package bicycle.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideThree;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {
    @Test
    public void shouldTestBikeRideThreeUsingMountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideThree(mountainBike);
        mBikeRide.ride();
        assertEquals(9, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldTestBikeRideThreeUsingRoadBike(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeRide = new BikeRideThree(roadBike);

        rBikeRide.ride();
        assertEquals(25, rBikeRide.currentSpeed());
    }

    @Test
    public void shouldTestBikeRideThreeUsingTandemBike(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRide = new BikeRideThree(tandemBike);

        bikeRide.ride();
        assertEquals(22, bikeRide.currentSpeed());
    }
}
