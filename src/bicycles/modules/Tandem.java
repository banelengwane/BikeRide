package bicycles.modules;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {
    public void accelerate(){
        this.changeSpeed(12);
    }

    @Override
    public void brake() {
        this.changeSpeed(-7);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }


}
