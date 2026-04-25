/*
    Question
    Tax Calculator Method: Create a method double calculateTax(double salary). If salary is less than 5 lakhs, tax = 0.
     If it is between 5 lakhs to 10 lakhs, then 10% tax on amount above 5 lakhs.
     If it is more than 10 lakhs, then 20% tax. Calculate tax and return.
 */
package practice.PartOne.Medium;
import java.util.Scanner;

public class TaxCalculatorMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tax calculator\n");

        System.out.print("Please enter your annual salary: ");
        double salary = input.nextDouble();

        if (salary < 0) {
            System.out.println("\n\t Please enter a \"Valid\" amount");
            return;
        }
        double calculateTax = calculateTax(salary);
        System.out.println("\n\t Your total payable tax is " + calculateTax);
    }
    public static double calculateTax(double salary) {
        double totalTax = 0;
        if (salary < 500000){
            totalTax = 0;
        }
        else if (salary >= 500000 && salary <= 1000000) {
            salary -= 500000;
            totalTax = (10 * salary) / 100;
        }
        else if (salary > 1000000) {
            salary -= 1000000;
            totalTax = ((20 * salary) / 100) + 50000;
        }
        return totalTax;
    }
}
