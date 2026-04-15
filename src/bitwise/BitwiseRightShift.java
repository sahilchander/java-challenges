/*
    Question:
    Create a program that shows use of right shift operator.

    Total Time:
    15 minutes (Questions visible upon start)

    Solved In:
    2 minutes 47 seconds

    Time Left:
    12 minutes 13 seconds

    Attempt:
    First Attempt

    Approach:
    Used bitwise right shift operator (>>) to shift right bits of a number.

    Status:
    Completed
*/

package bitwise;

import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Shift Calculator!!");

        System.out.print("Please Enter Your First Number: ");
        int firstNum =  input.nextInt();
        System.out.print("Please Enter Your Shift Count: ");
        int secondNum = input.nextInt();

        int sol = firstNum >> secondNum;

        System.out.println("\n\t Bitwise Right Shift Result is " + sol);
    }
}
