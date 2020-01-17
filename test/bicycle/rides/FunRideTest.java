package bicycle.rides;

import bicycles.*;
import bicycles.rides.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void testFunRideUsingRoadBike(){
        FunRide funRide = new FunRide(2);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bike1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bike2 = new BicycleFromSpec(roadBikeSpec);

        funRide.bicycleSpaces(bike1);
        funRide.bicycleSpaces(bike2);

        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void bikesShouldNotExceedTheNumberOfMaximumSpaces(){
        FunRide funRide = new FunRide(3);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mBike1 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mBike2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mBike3 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mBike4 = new BicycleFromSpec(mountainBikeSpec);

        funRide.bicycleSpaces(mBike1);
        funRide.bicycleSpaces(mBike2);
        funRide.bicycleSpaces(mBike3);
        funRide.bicycleSpaces(mBike4);

        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    public void testFunRidesForTandem(){
        FunRide funRide = new FunRide(2);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);

        Bicycle tBike1 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tBike2 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tBike3 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tBike4 = new BicycleFromSpec(tandemBikeSpec);

        funRide.bicycleSpaces(tBike1);
        funRide.bicycleSpaces(tBike2);
        funRide.bicycleSpaces(tBike3);
        funRide.bicycleSpaces(tBike4);

        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.Tandem));
    }
}
