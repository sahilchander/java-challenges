/*
    Question:
    Create a program that shows bitwise OR of two numbers.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    Time Over

    Time Left:
    00 minutes 00 seconds

    Attempt:
    Second Attempt

    Approach:
    Referred to course solution after initial attempt

    Status:
    Completed
*/

package bitwise;

import java.util.Scanner;

public class NumberCheckerUsingBitwise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even checker powered by bitwise operators");

        System.out.print("Please enter number to check: ");
        int num = input.nextInt();

        if (num >> 2 == 0) {
            System.out.println( num + " is even number");
        } else {
            System.out.println( num + " is odd number");
        }
    }
}
