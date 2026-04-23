/*
    Question:
    Absolute Difference: Take two numbers as input from the user.
    Always subtract the smaller number from the larger number and print the result (no negative results).
*/
package practice.PartOne.Easy;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Difference calculator");

        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("Now , please enter your second number: ");
        int num2 = input.nextInt();

        difference(num1 , num2);

    }
    public static void difference (int num1 , int num2) {
        if (num1 > num2) {
            int subtract = num1 - num2;
            System.out.println("\n\t" + num1 + " is greater than " + num2 + " and the difference between both is " + subtract);
        } else {
            int subtract2 = num2 - num1;
            System.out.println("\n\t" + num2 + " is greater than " + num1 + " and the difference between both is " + subtract2);
        }
    }
}
