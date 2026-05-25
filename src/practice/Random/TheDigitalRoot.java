/*
    Question
    The Digital Root (Single-Digit Sum) Write a program that takes a large number from the user.
    Use a while loop (or nested loops) to repeatedly add all its digits together until the final
    sum becomes a single-digit number. Print that final single digit.

    (Example: Input = 9875. Sum of digits: 9+8+7+5 = 29. Since 29 is two digits, sum again: 2+9 = 11.
    Still two digits, sum again: 1+1 = 2. Output is 2).

 */
package practice.Random;
import java.util.Scanner;

public class TheDigitalRoot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to The Digital Root Calculator\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num <= 0){
            System.out.println("\n\t Please enter a valid call!!");
            return;
        }

        int singleDigit = singleDigit(num);

        System.out.println("\n\t Single digit sum of " + num + " is " + singleDigit + ".");

    }
    public static int singleDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum < 10) {
            return sum;
        }
        return singleDigit(sum);
    }
}