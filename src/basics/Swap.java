/*
    Question:
    Create a program to swap two numbers.
*/
package basics;

import java.util.Scanner;

class Swap {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is a Number Basics.Swap Programm!");

        System.out.print("Please Enter Your First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Please Enter Your Second Number: ");
        int secondNum = input.nextInt();

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("Your First Swaped Number is " + firstNum );
        System.out.print("Your Second Swaped Number is " + secondNum);
    }
}
