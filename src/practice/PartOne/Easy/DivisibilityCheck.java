/*
    Question:
    Divisibility Check: Take a number and check whether it is exactly divisible by both 5 and 7 (logical &&).
*/
package practice.PartOne.Easy;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to divisibility checker ");

        System.out.print("Please enter your number to check: ");
        int num = input.nextInt();

        checkDivisibility(num);
    }
    public static void checkDivisibility (int num) {
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("\n\t" + num + " is divisible by 5 & 7");
        } else {
            System.out.println("\n\t" +num + " is not divisible by 5 & 7");
        }
    }
}
