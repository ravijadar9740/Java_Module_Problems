import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the present year : ");
        int present = sc.nextInt();
        System.out.print("Enter your birth year: ");
        int birth = sc.nextInt();
       

        int age = present - birth;
        System.out.println("Your age is: " + age);
    }
}
