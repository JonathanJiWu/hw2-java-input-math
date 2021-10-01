package Hw2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number");
        int num = scan.nextInt();
        arm(num);
        scan.close();
    }

    public static void arm(int n) {
        int remainingDigits = n;
        int sum = 0;
        while (remainingDigits>0){
            int digit = remainingDigits%10;
            System.out.println(digit);
            remainingDigits = remainingDigits/10;
            int product = digit*digit*digit;
            sum+=product;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("This is a Armstrong");
        }
        else {
            System.out.println("not");
        }
    }
}
