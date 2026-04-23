/*
    Question:
    Multiple of three: Write a method called isMultipleOfThree(int num) that returns a Boolean value.
    Returns true if the number is a multiple of 3, false otherwise.
*/
package practice.PartOne.Easy;

import java.util.Scanner;
public class MultipleOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiple of three\n");

        System.out.print("Please enter a number you want to check: ");
        int num = input.nextInt();

        boolean isMultpleOfThree = isMultipleOfThree(num);
        if (isMultpleOfThree) {
            System.out.println(num + " is Multiple of 3");
        } else {
            System.out.println(num + "is not Multiple of 3");
        }
    }
    public static boolean isMultipleOfThree(int num) {
        return (num % 3 == 0);
    }
}
