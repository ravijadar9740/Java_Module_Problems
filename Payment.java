abstract class Payment {
    public abstract void pay();
}

class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using Net Banking");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay();

        p = new UPIPayment();
        p.pay();

        p = new NetBankingPayment();
        p.pay();
    }
}
