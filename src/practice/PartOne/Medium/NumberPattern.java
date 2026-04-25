/*
    Question
    Number pattern: Use a nested while loop to print this pattern
    (get a row count from the user, e.g., 4): 1 2 2 3 3 3 4 4 4 4
 */
package practice.PartOne.Medium;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Pattern Maker\n");

        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        if (num < 0) {
            num =-num;
        }
        numPattern(num);
    }
    public static void numPattern(int num) {
        int i = 1;
        while (i <= num) {
            int counter = 1;
            while (counter <= i){
                System.out.print(i + " ");
                counter++;
            }
            i++;
        }
    }
}
