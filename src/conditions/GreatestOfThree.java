package conditions;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest of three checker!! \n");

        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();

        System.out.print("Please enter your third number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("\n\t" + num1 + "(Your First) is Greatest of all Given Numbers!");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\n\t" + num2 + " (Your Second) is Greatest of all Given Numbers!");
        } else {
            System.out.println("\n\t" + num3 + " (Your Third) is Greatest of Given Numbers");
        }
    }
}
