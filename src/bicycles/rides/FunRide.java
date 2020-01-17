package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private int maxBikes;

    private List <Bicycle> bicycles = new ArrayList<>();

    public FunRide(int maxBikes){
        this.maxBikes = maxBikes;
    }

    public int getCountForType(BicycleType bikeType){
        int count = 0;
        for(Bicycle bicycle: bicycles) {
            if(bicycle.getBicycleType() == bikeType) {
                count++;
            }
        }

        return count;
    }

    public int getEnteredCount(){
        return bicycles.size();
    }

    public void bicycleSpaces(Bicycle bicycle){
        if(maxBikes > bicycles.size()){
            bicycles.add(bicycle);
        } else {
            System.out.println("There are no more spaces available for Bikes");
        }
    }
}
