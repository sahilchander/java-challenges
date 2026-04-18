package numberlogic;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome number checker");

        System.out.print("Please enter your number to check: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.print(num + " is a Palindrome number");
        } else {
            System.out.print(num + " is not a Palindrome number");
        }

    }
    public static boolean isPalindrome(int num) {
        int numCopy = num;
        int store = 0;
        while (num > 0) {
            store += (num%10);
            store *= 10;
            num /=10;
        }
        store /= 10;
        return numCopy == store;
    }
}
