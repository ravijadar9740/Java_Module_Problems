final class CentralBankRules {
    public void showRules() {
        System.out.println("Central Bank Rules: Must be followed by all banks.");
    }
}

class Account {
    private final String accountNumber;  

    public Account(String accNo) {
        this.accountNumber = accNo;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public final void bankPolicy() {
        System.out.println("Bank Policy: KYC required, minimum balance rules apply.");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accNo) {
        super(accNo);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accNo) {
        super(accNo);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345");
        System.out.println("Savings Account Number: " + sa.getAccountNumber());
        sa.bankPolicy();

        CurrentAccount ca = new CurrentAccount("CA67890");
        System.out.println("Current Account Number: " + ca.getAccountNumber());
        ca.bankPolicy();

        CentralBankRules rules = new CentralBankRules();
        rules.showRules();
    }
}
