/*
    Question:
    Create a program to calculate product of two floating points numbers.
*/
package basics;

import java.util.Scanner;

class SumofFloat {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Float Calculator: \n");
        System.out.print("Please Enter Your First Number: ");
        float firstNum = input.nextFloat();
        System.out.print("Now, Please Enter You Second Number Please: ");
        float secondNum = input.nextFloat();

        float ans = firstNum * secondNum;

        System.out.println("Product of Your Numbers are: " + ans);
    }
}
