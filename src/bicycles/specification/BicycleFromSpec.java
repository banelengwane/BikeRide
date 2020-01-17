package bicycles;

public class BicycleFromSpec extends BicycleBase {
    BicycleSpecification bikeSpec;

    public BicycleFromSpec(BicycleSpecification bikeSpec){
        this.bikeSpec = bikeSpec;
    }

    @Override
    public void accelerate() {
        this.changeSpeed(bikeSpec.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed((-1)*bikeSpec.getBreakSpeed());
    }

    @Override
    public BicycleType getBicycleType() {
        return bikeSpec.getBicycleType();
    }

}
