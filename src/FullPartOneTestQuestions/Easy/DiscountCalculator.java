package FullPartOneTestQuestions.Easy;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Discount Center");

        System.out.print("Please enter your amount to find your discount: ");
        int num = input.nextInt();

        dicount(num);
    }
    public static void dicount (int num) {
        if (num >= 1000) {
            int discount = (15 * num) /100;
            System.out.println("\n\tYou got 15% discount & your discounted price is " + (num - discount));
        } else {
            int discount = (5 * num) /100;
            System.out.println("\n\tYou got 5% discount & your discounted price is " + (num - discount));
        }
    }
}
