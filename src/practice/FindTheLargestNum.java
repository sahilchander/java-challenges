package practice;

import java.util.Scanner;

public class FindTheLargestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to largest Digit finder\n");

        System.out.print("Please enter a number to find: ");
        int num = input.nextInt();
        int isLargest = isLargest(num);
        System.out.println(isLargest + " is the largest digit in given number.");
    }
    public static int isLargest(int num) {
        int digit = 0;
        while (num > 0) {
            if (digit < (num%10)) {
                digit = num % 10;
                num /= 10;
            }else {
                num /= 10;
            }
        }
        return digit;
    }
}
