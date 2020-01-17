package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {
    private BicycleType bicycleType;
    private int accelerationSpeed;
    private int breakSpeed;

    public BicycleSpecification(int accelerationSpeed, int breakSpeed, BicycleType bicycleType){
        this.accelerationSpeed = accelerationSpeed;
        this.breakSpeed = breakSpeed;
        this.bicycleType = bicycleType;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBreakSpeed(){
        return breakSpeed;
    }


}
