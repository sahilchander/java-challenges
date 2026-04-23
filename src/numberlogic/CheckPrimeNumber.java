/*
    Question:
    Create a program to check whether a given number is prime.
*/
package numberlogic;

import java.util.Scanner;

public class CheckPrimeNumber {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number calculator");

        System.out.print("Please enter the number to check: ");
        int priNum = input.nextInt();

        String value = prime(priNum);
        System.out.println(value);


    }
    public static String prime (int priNum) {
        String result = "Prime";
        int i = 2;
        if (priNum < 2) {
            result = "Not prime";
        }
        while (i < priNum) {
            if (priNum % i == 0) {
                result = "Not Prime";
                break;
            }i++;
        } return result;
    }
}
