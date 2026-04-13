package practice;

import java.util.Scanner;

 class SumofTwo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("This is a Two Sum Calucator!!\nPlease Enter Your First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.print("Here is Your Total of Two Numbers: " + sum);
    }
}
