/*
    Question
    The 3n + 1 Sequence (Collatz Conjecture) Write a program that takes a positive integer n from the user.
    Use a while loop to print the sequence of numbers according to these rules:

    If n is even, divide it by 2.
    If n is odd, multiply it by 3 and add 1. Continue this process until n becomes exactly 1. Finally,
    print the total number of steps (iterations) it took to reach 1.
    (Example: If n = 6. Sequence: 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1. Total steps: 8).

 */
package practice.Random;
import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("WelCome to Collatz Conjecture Calculator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num <= 0){
            System.out.println("\n\tPlease enter a Valid Call!!");
            return;
        }
        if (num == 1){
            System.out.println("\n\tYour Number is already \"1\"");
            return;
        }

        int count = totalStep(num);

        System.out.println("\n\n\t Total Number of Steps is " + count);

    }
    public static int totalStep(int num){
        int i = 0;
        System.out.println("Start: " + num);
        int count = 0;
        while (num > 1){
            if (num % 2 == 0){
                num = num / 2;
            }else {
                num = (num * 3) + 1;
            }
            count++;
            i++;
            if (num > 1) {
                System.out.println("Step " + i + ": " + num);
            }
        }
        return count;
    }
}