/*
    Question:
    Create a program that shows bitwise XOR of two numbers.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    3 minutes 12 seconds

    Time Left:
    11 minutes 48 seconds

    Attempt:
    First Attempt

    Approach:
    Used bitwise XOR operator (^) to compare bits of two numbers.

    Status:
    Completed
*/
package bitwise;

import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Xor calculator!");

        System.out.print("Please enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter your second number: ");
        int secondNum = input.nextInt();

        int sol = firstNum ^ secondNum;

        System.out.println("\n\t Xor is " + sol);
    }
}
