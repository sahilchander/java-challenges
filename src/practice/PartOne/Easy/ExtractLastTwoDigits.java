/*
    Question:
    Extract last two digits: Take a large number (number) from the user and print only its last two digits
    (hint: use the model operator % to do that).
*/
package practice.PartOne.Easy;

import java.util.Scanner;

public class ExtractLastTwoDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Last Two Digit Extracter\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        lastTwoDigit(num);

    }
    public static void lastTwoDigit(int num) {
        int numcopy = num;
        int store = 0;
        int store2 = 0;
        int i = 1;
        while (i < 2) {
            store = num % 10;
            num/=10;
            store2 = num % 10;
            num/=10;
            i++;
        }
        System.out.print("last two digit of " + numcopy + " is " + store2 + store);
    }
}
