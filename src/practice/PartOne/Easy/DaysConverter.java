/*
    Question:
    Days Converter: Input the total number of days from the user (e.g., 400).
    Then convert and print Years, Months, and remaining Days (Assume 1 Year = 365 days, 1 Month = 30 days).
*/
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
        int years = 0;
        int month = 0;
        int day = 0;
        if (days > 365) {
            years = days/365;
            System.out.print(years + " Years" + " = " + (years * 365) + " days , ");
            month = (days%365)/30;
            System.out.print(month + " Months" + " = " + (days % 365) + " days , ");
            day = (days%365)%30;
            System.out.println(day + " Days");
        }else {
            month = days/30;
            System.out.print(month + " Months" + " = " + (month * 30) + " days , ");
            day = days%30;
            System.out.println(day + " Days");
        }
    }
}
