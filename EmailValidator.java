import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        try {
            validateEmail(email);
            System.out.println("Valid email: " + email);
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol.");
        }
    }
}
