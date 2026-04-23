/*
    Question:
    Create a program to check if a number is an Armstrong number.
*/
package numberlogic;

import java.util.Scanner;

public class ArmStrongChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ArmStrong Number Checker");

        System.out.print("Please enter your number to check: ");
        int num = input.nextInt();

        armStrong(num);

    }

    public static void armStrong (int num) {
        int digit = noofdigit(num);
        double store = 0;
        int num2 = num;
        while (num > 0) {
            store += Math.pow((num%10),digit);
            num /= 10;
        }
        if (num2 == store) {
            System.out.print(num2 + " is ArmStrong Number");
        }else {
            System.out.print(num2 + " is Not ArmStrong Number");
        }
    }
    public static int noofdigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        } return digit;
    }
}
