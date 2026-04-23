/*
    Question:
    Create a program that determines if a number is odd or even.
*/
package conditions;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Number Checker!!");

        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

        if (num%2 == 0) {
            System.out.println("\n\t Your Number is Even");
        } else {
            System.out.println("\n\tYour Number is Odd ");
        }
    }
}
