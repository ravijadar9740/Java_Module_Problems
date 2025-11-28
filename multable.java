import java.util.*;
public class multable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the required multiplication table : ");
        int n = sc.nextInt();
        System.out.println("The multiplication Table of "+n+" follows : \n");
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+ i*n);
        }
        System.out.println();
        sc.close();
    }
}