import vehicles.*;

public class TestVehicles {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();

        v1.speed();
        v2.speed();
    }
}
