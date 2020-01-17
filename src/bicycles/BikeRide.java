package bicycles;

public class BikeRide {

    Bicycle bicycle;
    public BikeRide(Bicycle bi){
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
