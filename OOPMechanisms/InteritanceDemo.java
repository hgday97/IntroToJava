package OOPMechanisms;

// Inheritance is a programming concept where a class (subclass or derived class) can acquire and reuse the properties and behaviors of another class (superclass or base class).

public class InteritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Bike speed is: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying break is: " + mountainBike.speed);
    }
}
