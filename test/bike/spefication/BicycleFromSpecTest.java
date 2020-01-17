package bike;

import bicycles.Bicycle;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
    @Test
    public void testRoadBike(){
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle rBike = new BicycleFromSpec(roadBike);

        rBike.accelerate();
        rBike.accelerate();
        rBike.brake();
        rBike.brake();

        assertEquals(14, rBike.currentSpeed());
    }

    @Test
    public void mountainShouldNotRevers(){
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mBike = new BicycleFromSpec(mountainBike);

        mBike.accelerate();
        mBike.brake();
        mBike.brake();

        assertEquals(0, mBike.currentSpeed());
    }

    @Test
    public void tandemBikeTest(){
        BicycleSpecification tandemBike = new BicycleSpecification(10, 5, BicycleType.Tandem);
        Bicycle tBike = new BicycleFromSpec(tandemBike);

        tBike.accelerate();
        tBike.accelerate();
        tBike.brake();
        tBike.stop();
        tBike.brake();
        tBike.accelerate();

        assertEquals(10, tBike.currentSpeed());
    }
}
