package bicycles;

public abstract class BicycleBase implements Bicycle{
    private int speed;
    protected void changeSpeed(int changeValue){
        if((speed + changeValue) >= 0)
            speed += changeValue;
    }

    public void stop(){
        speed = 0;
    }

    public int currentSpeed(){
        return speed;
    }
}
