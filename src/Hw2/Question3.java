package Hw2;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
//        Write a program to see if a user entered string is a palindrome or not
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some character to see if they are Palindromes: ");
        String input = scan.nextLine();

        if(isPali(input))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
        scan.close();
    }

    public static boolean isPali(String args) {
//        Take two pointers i pointing to the start of the string and j pointing to the end of the string.
//        Keep incrementing i and decrementing j while i < j and at every step check whether the characters at these pointers are same or not.
//        If not then the string is not a palindrome else it is.
        int i = 0;
        int j = args.length() - 1;
        while (i<j){
            if(args.charAt(i) != args.charAt(j))
                return false;
                i++;j--;
        }
        return true;
    }
}
//String rando = "1234567";
//System.out.println(rando.length());