/*
    Question
    Largest Digit: Take a number from the user and using a while loop,
    find the largest digit of that number and print it (e.g., in 7294, largest is 9).
 */
package practice.PartOne.Medium;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Largest Digit Calculator\n");

        System.out.print("Please enter your first number: ");
        int num = input.nextInt();

        int largestDigit = largestDigit(num);
        System.out.println("Largest Digit in " + num + " \"" + largestDigit + "\"");
    }
    public static int largestDigit (int num) {
        int larDigit = 0;
        if (num < 0) {
            num = -num; // Making negative number positive
        }
        while (num > 0) {
            if (larDigit < num % 10 ) {
                larDigit = num % 10;
            }num /= 10;
        }
        return larDigit;
    }
}
