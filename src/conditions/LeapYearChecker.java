/*
    Question:
    Create a program that determines if a given year is a leap year
    (considering conditions like divisible by 4 but not 100, unless also
    divisible by 400).
*/
package conditions;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap Year Checker!!\n");

        System.out.print("Please Enter The Year You Want to Check(Example - XXXX): ");
        int year = input.nextInt();

        if (year%4 == 0 && year%100 != 0) {
            System.out.println("\n\t Year " + year + " is Leap Year");
        } else if (year%400 == 0) {
            System.out.println("\n\t Year " + year + " is Leap Year");
        } else {
            System.out.println("\n\t Year " + year + " is not a Leap Year");
        }
    }
}