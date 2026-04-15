/*
    Question:
    Create a program that shows bitwise OR of two numbers.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    3 minutes 13 seconds

    Time Left:
    11 minutes 47 seconds

    Attempt:
    First Attempt

    Approach:
    Used bitwise OR operator (|) to compare bits of two numbers.

    Status:
    Completed
*/
package bitwise;

import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to (Or) Bitwise Calculator!!\n");

        System.out.print("Please enter your First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, PLease enter your second number: ");
        int secondNum = input.nextInt();

        int sol = firstNum | secondNum;

        System.out.println("\n\t Your Bitwise (|) Value is " + sol);
    }
}
