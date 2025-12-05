package vehicles;

public class Car implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Car speed: 150 km/h");
    }
}