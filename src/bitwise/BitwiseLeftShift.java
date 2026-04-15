/*
    Question:
    Create a program that shows use of left shift operator.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    4 minutes 12 seconds

    Time Left:
    10 minutes 46 seconds

    Attempt:
    First attempt

    Approach:
    Used bitwise left shift operator (<<) to shift Left bits of a number.

    Status:
    Completed
*/

package bitwise;

import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LeftShift Calculator!\n");

        System.out.print("Please enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please enter your Shift Count: ");
        int secondNum = input.nextInt();

        int sol = firstNum << secondNum;

        System.out.println("\n\t Bitwise LeftShift Result is " + sol);
    }
}
