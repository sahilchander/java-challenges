/*
    Question:
    Create a program to calculate Compound interest.
*/
package basics;

import java.util.Scanner;

public class Compundinterest {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("WelCome to Compound Interest Calculator!\n");
        System.out.print("Enter The Principal Amount(Rs): ");
        int priAmount = input.nextInt();
        System.out.print("Now, Please Enter Your Interest Rate: ");
        float rateIntrest = input.nextFloat();
        System.out.print("Now, Please enter your Time Period In Year: ");
        float years = input.nextFloat();

        double total = priAmount * Math.pow((1 + rateIntrest/100),years);
        double rs = total - priAmount;

        System.out.print("\n\tYour Total Amount is Rs" + total);
        System.out.print("\n\tYour Compound Interest is Rs" + rs);
    }
}
