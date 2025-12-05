interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    @Override
    public double rateOfInterest() {
        return 6.5;
    }
}

class HDFC implements Bank {
    @Override
    public double rateOfInterest() {
        return 7.2;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Rate of Interest: " + b1.rateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + b2.rateOfInterest() + "%");
    }
}
