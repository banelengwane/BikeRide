package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideThree implements BikeRide{
    Bicycle bicycle;
    public  BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
    }
    @Override
    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.stop();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }
}
