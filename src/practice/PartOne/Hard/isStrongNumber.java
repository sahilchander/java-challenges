/*
    Question
    Strong Number: A number is strong if the sum of the factorials of each of its digits is equal to the original number.
    (e.g., 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145). Here you will have to mix both the factorial method and the sum of digits.
 */
package practice.PartOne.Hard;

import java.util.Scanner;

public class isStrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Strong number checker\n");

        System.out.print("Please enter a number to check: ");
        int num = input.nextInt();
        if (num <= 0){
            System.out.println("\n\t Please enter a \"valid\" number!");
            return;
        }

        boolean isStrong = isStrong(num);
        if (isStrong) {
            System.out.println("\n\t" + num + " is a \"Strong\" number");
        } else {
            System.out.println("\n\t" + num + " is a \"not\" Strong number");
        }
    }
    public static boolean isStrong(int num) {
        int numCopy = num;

        int digit = 0;
        int sumNum = 0;

        while (num > 0) {
            digit = num % 10;
            int i = 1;
            int factorial = 1;
            while (i <= digit) {
                factorial *= i;
                i++;
            }
            num /= 10;
            sumNum += factorial;
        }
        return sumNum == numCopy;
    }
}
