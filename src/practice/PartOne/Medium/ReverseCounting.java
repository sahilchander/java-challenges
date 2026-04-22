package practice.PartOne.Medium;

import java.util.Scanner;

public class ReverseCounting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse counter");

        System.out.print("please enter the number from where you want start reverse counter: ");
        int num = input.nextInt();

        System.out.print("How to want to you print numbers (enter 1 for vertically and 0 for horizontally: )");
        int ask = input.nextInt();

        if (ask ==1 ) {
            printVertically(num);
        } else if (ask == 0) {
            printHorizontally(num);
        } else {
            System.out.println("please enter valid call");
        }
    }

    public static void printVertically(int num) {
        while (num > 0) {
            System.out.println(num + " ");
            num--;
        }
    }

    public static void printHorizontally(int num) {
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }
    }
}