/*
    Question:
    Create a program to print the Fibonacci series up to a certain number.
*/
package numberlogic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Calculator\n");

        System.out.print("Please Enter a number from where you want to generate fibonacci: ");
        int num = input.nextInt();
        fibo(num);

    }
    public static void fibo(int num) {
        int store1 = 1;
        int store2 = 2;
        int sum = store1 + store2;
        System.out.print("1,1,2,");
        while (num > sum) {
            System.out.print(sum+ ",");
            store1 = store2;
            store2 = sum;
            sum = store1 + store2;
        }
    }
}
