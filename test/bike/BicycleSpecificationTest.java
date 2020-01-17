package bike;

import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test
    public void testRoadBikeSpecifications(){
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        assertEquals(11, roadBike.getAccelerationSpeed());
        assertEquals(4, roadBike.getBreakSpeed());
        assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());
    }
}
