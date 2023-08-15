package OOPMechanisms;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int startHeight, 
                        int startSpeed, 
                        int startGear) {
        super(startSpeed, startGear);  // super refers to base class (the class of which this one extends)
        seatHeight = startHeight;
    }
            
    public void setHeight(int newValue) {

    }
}
