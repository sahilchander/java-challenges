/*
    Question:
    Create a program to find the Least Common Multiple (LCM) of two numbers.
*/
package numberlogic;

import java.util.Scanner;

public class LcmofTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator");

        System.out.print("Please Enter your first number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, Please Enter Your second number: ");
        int secondNum = input.nextInt();

        int lcm = Lcm(firstNum , secondNum);

        System.out.print("Your Lcm of " + firstNum + " & " + secondNum + " is " + lcm);

    }
    public static int Lcm(int firstNum , int secondNum) {
        int i = 1;
        while (true) {
            int factor = firstNum * i;
            if (factor % secondNum == 0) {
                return factor;
            }i++;
        }
    }

}


