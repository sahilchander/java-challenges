package practice.PartOne.Easy;

import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to salary increment\n");

        System.out.print("Please enter your salary: ");
        double currentsalary = input.nextDouble();

        double newSalary = calculateNewSalary(currentsalary);
        System.out.println("Your new Salary is " + newSalary);
    }
    public static double calculateNewSalary(double currentSalary) {
        double newSalary = 0;
        newSalary = (((double) 10 / 100) * currentSalary) + currentSalary;
        return newSalary;
    }
}
