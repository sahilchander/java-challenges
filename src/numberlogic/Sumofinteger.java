/*
    Question:
    Create a program that computes the sum of the digits of an integer.
*/
package numberlogic;

import java.util.Scanner;

public class Sumofinteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to intigar sum calculator");
        System.out.print("Please enter your number to sum: ");
        int num = input.nextInt();


        int store1 = 0;
        while (num > 0) {
            store1 = store1 + (num%10);
            num /= 10;
        }
        System.out.println(store1);
    }
}
