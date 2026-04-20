package numberlogic;

import java.util.Scanner;

public class FactorialCal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial Calculator");

        System.out.print("Please Enter the Number to Get Factorial: ");
        long limitNum = input.nextInt();

        if (limitNum < 2) {
            System.out.println("Your Factorial is 1");
        } else {
             long fact = 1;
             int i = 1;
             while (i <= limitNum) {
             fact *= i;
             i++;
             }
            System.out.println("Your Factorial is " + fact);
        }
    }
}
