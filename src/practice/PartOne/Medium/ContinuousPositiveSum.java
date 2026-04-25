/*
    Question
    Continuous Input (Sum of Positives): Create a while (true) loop. Ask the user for numbers. As long as the user enters
    positive numbers, add them up. As soon as the user enters a negative number, break (or return)
    the loop and print the total sum so far.
 */
package practice.PartOne.Medium;

import java.util.Scanner;

public class ContinuousPositiveSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Continuous Input (Sum of Positives)\n");

        int sum = 0;

        while (true) {
            System.out.print("Please enter your number: ");
            int num = input.nextInt();
            if (num >= 0) {
                sum += num;
            } else {
                System.out.println("\n\t Sum of your positive numbers is " + sum);
                return;
            }

        }
    }
}
