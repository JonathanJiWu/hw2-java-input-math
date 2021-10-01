package Hw2;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
//Write Fibonnaci series between the user entered start and end values
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to see some fib-actions: ");
        int num = scan.nextInt();
        fibonacci(num);
        scan.close();
    }

    public static void fibonacci (int n) {
        int num1 = 0;
        int num2 = 1;
        for(int i=0; i<n; i++){
            System.out.print(num1+", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
