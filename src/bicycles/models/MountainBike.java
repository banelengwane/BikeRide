package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {

    public void accelerate(){
        this.changeSpeed(5);
    }

    public void brake(){
        this.changeSpeed(-3);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;
    }

}
