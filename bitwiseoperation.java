import java.util.*;

public class bitwiseoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("AND (&) = " + Integer.toBinaryString(a & b));
        System.out.println("OR (|) = " + Integer.toBinaryString(a | b));
        System.out.println("XOR (^) = " + Integer.toBinaryString(a ^ b));
    }
}