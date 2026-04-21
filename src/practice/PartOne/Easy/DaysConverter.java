package practice.PartOne.Easy;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to days converter");

        System.out.print("Please enter total number of days: ");
        int days = input.nextInt();

        years(days);
    }
    public static void years (int days) {
        int years = days/365;
        int leftdays = days%365;
        int month = leftdays/30;
        int leftdaysm= month%30;
        System.out.println(years + " Years");
        System.out.println(month + " Months");
        System.out.println(leftdaysm + " Days");


    }
}
