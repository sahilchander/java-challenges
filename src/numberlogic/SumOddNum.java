/*
    Question:
    Create a program to sum all odd numbers from 1 to a specified number N.

    Total Time:
    50 minutes (Questions visible upon start)

    Solved In:
    28 minutes 27 seconds

    Time Left:
    22 minutes 33 seconds

    Attempt:
    Second Attempt

    Approach:
    Used while loops and else if to Develop the given program.

    Status:
    Completed
*/

package numberlogic;

import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Number Calculator");

        System.out.print("\nPlease enter the till your want to add Odd Numbers: ");
        int limit = input.nextInt();

        int i = 0;
        int count = 0;

        while (i <= limit) {
            if (i % 2 != 0) {
                count+=i;
                System.out.println("+" + i + " = " + count);
            } if (i == limit) {
                System.out.print("\nTotal sum of all odd number till " + limit + " is " + count);
            }i++;
        }
    }
}
