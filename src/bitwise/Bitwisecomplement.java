/*
    Question:
    Create a program that shows bitwise complement of a number.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    4 minutes 12 seconds

    Time Left:
    10 minutes 48 seconds

    Attempt:
    First Attempt

    Approach:
    Used bitwise Complement operator (~) to compare bits numbers.

    Status:
    Completed
*/
package bitwise;

import java.util.Scanner;

public class Bitwisecomplement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Complement Calculator!!\n");

        System.out.print("Please enter your number: ");
        int firstNum = input.nextInt();

        int sol = ~firstNum;

        System.out.println("\n\t Bitwise Complement Result is " + sol);
    }
}
