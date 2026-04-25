/*
    Question
    Continuous Input (Sum of Positives): Create a while (true) loop. Ask the user for numbers. As long as the user enters
    positive numbers, add them up. As soon as the user enters a negative number, break (or return)
    the loop and print the total sum so far.
 */
package practice.PartOne.Medium;

import java.util.Scanner;

public class ContinuousInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to continuous sum Calculator\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("\n\t Please enter number above \"0\"");
            return;
        } else if (num % 2 != 0) {
            System.out.println("\n\t Please start with \"Even\" value");
            return;
        }

        while (num % 2 == 0) {
            System.out.print("Please enter your number: ");
            int checkNum = input.nextInt();
            if (checkNum % 2 == 0 && checkNum > 0) {
                num += checkNum;
            } else {
                System.out.println("Total sum of your all positive number is \"" + num + "\"");
                return;
            }
        }
    }
}
