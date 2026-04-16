/*
    Question:
    Develop a program that prints the multiplication table for a given number

    Total Time:
    25 minutes (Questions visible upon start)

    Solved In:
    8 minutes 08 seconds

    Time Left:
    16 minutes 52 seconds

    Attempt:
    First Attempt

    Approach:
    Used while loops to Develop the given program.

    Status:
    Completed
*/

package numberlogic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table Maker");

        System.out.print("Please enter your number to generate table: ");
        int table = input.nextInt();
        System.out.print("Please enter the number where you want to make table: ");
        int till = input.nextInt();

        int start = 1;
        while (start <= till) {
            int sol = table * start;
            System.out.println(table + " x " + start + " = " + sol);
            start++;
        }
    }
}
