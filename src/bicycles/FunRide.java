package bicycles;

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
        for(int i = 0; i < bicycles.size(); i++){
            if(bicycles.get(i).getBicycleType() == bikeType){
                count++;
            }
        }

        return count;
    }

    public int getEnteredCount(){
        return bicycles.size();
    }

    public void bicycleSpaces(Bicycle bi){
        if(maxBikes > bicycles.size()){
            bicycles.add(bi);
        } else {
            System.out.println("There are no more spaces available for Bikes");
        }
    }
}
