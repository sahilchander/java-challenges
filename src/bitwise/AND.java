/*
    Question:
    Create a program that computes the bitwise AND of two numbers.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    4 minutes 03 seconds

    Time Left:
    10 minutes 57 seconds

    Attempt:
    First Attempt

    Approach:
    Used bitwise AND operator (&) to compare bits of two numbers.

    Status:
    Completed
*/
package bitwise;

import java.util.Scanner;

public class AND {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise (&) Calculator!\n");

        System.out.print("Please Enter Your First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Now , Please Enter Your Second Number: ");
        int secondNum = input.nextInt();

        int sol = firstNum & secondNum;

        System.out.println("\n\t The (&) Bitwise Is " + sol);
    }
}
