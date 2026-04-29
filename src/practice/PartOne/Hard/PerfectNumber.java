/*
    Question
    Perfect Number: A number is perfect when the sum of all its proper divisors (excluding itself) equals that number.
    (e.g., the divisors of 6 are 1, 2, 3. Sum = 1+2+3 = 6). Check if the user's number is perfect or not.
 */
package practice.PartOne.Hard;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perfect number finder\n");

        System.out.print("Please enter number to check: ");
        int num = input.nextInt();

        if (num <= 0){
            System.out.println("\n\t Please enter a \"valid\" number!");
            return;
        }
        boolean isPerfectNumber = isPerfectNumber(num);
        if (isPerfectNumber) {
            System.out.println("\n\t" + num + " is \"perfect\" number");
        } else {
            System.out.println("\n\t" + num + " is \"not\" perfect number");
        }
    }
    public static boolean isPerfectNumber(int num) {
        int i = 1;
        int divisors = 0;
        while (i < num){
            if (num % i == 0){
                divisors += i;
            }
            i++;
        }
        return num == divisors;
    }
}
