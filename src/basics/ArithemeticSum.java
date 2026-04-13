package basics;

import java.util.Scanner;

class ArithemeticSum {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator!!");

        System.out.print("Please Enter Your First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mul = firstNum * secondNum;
        float div = firstNum / secondNum;
        int mod = firstNum % secondNum;

        System.out.println("Here Are Your Arithmetic Results...");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Divide: " + div);
        System.out.println("Modulas: " + mod);
    }
}
