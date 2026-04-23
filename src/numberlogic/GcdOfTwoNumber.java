/*
    Question:
    Create a program to find the Greatest Common Divisor (GCD) of two integers.
*/
package numberlogic;

import java.util.Scanner;

public class GcdOfTwoNumber {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to GCD Calculator");

        System.out.print("Please Enter your first number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, Please Enter Your second number: ");
        int secondNum = input.nextInt();

        int sol = gcd (firstNum ,secondNum);

        System.out.println("GCD IS " + sol);


    }
    public static int gcd (int firstNum , int secondNum) {
        int i = 1;
        int gcd = 1;
        int least = least(firstNum , secondNum);
        while (i <= least) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least (int firstNum , int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }else return secondNum;
    }
}





