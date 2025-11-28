class Doctor {
    void consultationFee() {
        System.out.println("General consultation fee");
    }
}

class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: 500");
    }
}

class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: 1000");
    }
}

class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: 1500");
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Dentist();
        d1.consultationFee();

        Doctor d2 = new Cardiologist();
        d2.consultationFee();

        Doctor d3 = new Surgeon();
        d3.consultationFee();
    }
}
