/*
    Question:
    First N Multiples: Collect two numbers from the user: X and N. You need to print the first N multiples of X.
    (For example, if X=5, N=4 then the output should be: 5, 10, 15, 20).
*/
package practice.PartOne.Medium;

import java.util.Scanner;

public class FirstNMultiples {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to First N multiples\n");

        System.out.print("Please enter your first number: ");
        int num = input.nextInt();

        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();

        nMultiples(num , num2);
    }
    public static void nMultiples(int num , int num2) {
        int i = 1;
        while (i <= num2) {
            System.out.print(num * i);

            if (i < num2) {
                System.out.print(", ");
            }
            i++;
        }
    }
} 
