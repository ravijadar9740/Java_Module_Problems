class Doctor {
    public void consultationFee() {
        System.out.println("General consultation fee");
    }
}

class Dentist extends Doctor {
    @Override
    public void consultationFee() {
        System.out.println("Dentist consultation fee: 500");
    }
}

class Cardiologist extends Doctor {
    @Override
    public void consultationFee() {
        System.out.println("Cardiologist consultation fee: 1000");
    }
}

class Surgeon extends Doctor {
    @Override
    public void consultationFee() {
        System.out.println("Surgeon consultation fee: 1500");
    }
}

public class Doctorfee {
    public static void main(String[] args) {
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
