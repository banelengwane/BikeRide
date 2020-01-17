package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class RoadBike extends BicycleBase {
   public void accelerate(){
        this.changeSpeed(11);
    }

    public void brake(){
        this.changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }
}
