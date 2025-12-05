import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age;
        boolean citizenship;
        
        System.out.print("Enter age: ");
        age = sc.nextInt();
        
        System.out.print("Are you a citizen? (true/false): ");
        citizenship = sc.nextBoolean();
        
        if (age >= 18 && citizenship) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
