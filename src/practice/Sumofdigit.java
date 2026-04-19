package practice;

import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of digit Calculator\n");

        System.out.print("Please enter your number to sum: ");
        int num = input.nextInt();
        int sumofDigit = sumOfDigit(num);
        System.out.println("Sum of your number is " + sumofDigit);

    }
    public static int sumOfDigit(int num) {
        int store = 0;
        while (num > 0){
            store += (num%10);
            num /= 10;
        }
        return store;
    }
}
