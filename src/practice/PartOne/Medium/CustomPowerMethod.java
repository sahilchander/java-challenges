/*
    Question:
    Custom Power Method: In the course, we saw Math.pow(). Now you need to write your own method
    calculatePower(int base, int exponent). In this, multiply the base times the exponent
    using a while loop and return (calculate the power from scratch).
*/
package practice.PartOne.Medium;

import java.util.Scanner;

public class CustomPowerMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Math Power Method\n");

        System.out.print("Please enter your base number: ");
        int base = input.nextInt();

        System.out.print("Please enter your exponent number: ");
        int exponent = input.nextInt();

        int myMathPower = myMathPow(base , exponent);
        System.out.println("Answer is " + myMathPower);
    }
    public static int myMathPow(int base, int exponent ) {
        int result = 1;

        if (exponent == 0) {
            return 1;
        }
        while (exponent > 0){
            result = base * result;
            exponent--;
        }
        return result;
    }
}
