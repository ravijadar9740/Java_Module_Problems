class Transport {
    public void deliver() {
        System.out.println("General delivery");
    }
}

class Truck extends Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }
}

class Ship extends Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Ship");
    }
}

class Airplane extends Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Airplane");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport t;

        t = new Truck();
        t.deliver();   // Delivering by Truck

        t = new Ship();
        t.deliver();   // Delivering by Ship

        t = new Airplane();
        t.deliver();   // Delivering by Airplane
    }
}
