package conditions;

import java.util.Scanner;

public class PositiveNegativeZero {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Positive/Negative/Zero Checker!!\n");
        System.out.print("Please Enter your number to check: ");
        double num = input.nextFloat();

        if (num > 0) {
            System.out.println("\n\tYour Number is Positive");
        } else if (num < 0 )  {
            System.out.println("\n\tYour Number Is Negative");
        } else {
            System.out.println("\n\tYour Number is Zero!");
        }
    }
}
