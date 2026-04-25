/*
    Question
    Perfect Square Check: Input a number and tell it whether it is a perfect square without using Math.sqrt()
    (e.g., 25 is a perfect square because 5*5=25, 20 is not). Start checking from 1 using a loop.
 */
package practice.PartOne.Medium;

import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Square checker\n");

        System.out.print("Please enter your number to check: ");
        int num = input.nextInt();
        if (num < 0){
            System.out.println("You enter a negative number \nDo you want to change your number? (1 for yes , 0 for no)");
            int confirmation = input.nextInt();
            if (confirmation == 1) {
                System.out.print("Enter your new number: ");
                num = input.nextInt();
            }else if (confirmation == 0){
                num = -num;
                System.out.println("your number is converted into positive number \"" + num + "\"");
            }else {
                System.out.println("Please restart the program to continue...");
                return;
            }
        }

        boolean isSquare = isSquare(num);
        if (isSquare){
            System.out.println(" \n\t\"" + num + "\" is a Perfect Square");
        } else {
            System.out.println(" \n\t\"" + num + "\" is not a Perfect Square");
        }

    }
    public static boolean isSquare(int num) {
        int i = 0;
        while (i * i <= num){
            if (i * i == num){
                return true;
            }i++;
        }
        return false;
    }
}
