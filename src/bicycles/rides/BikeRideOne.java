package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideOne implements BikeRide{

    Bicycle bicycle;
    public BikeRideOne(Bicycle bi){
        this.bicycle = bi;
    }
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
}
