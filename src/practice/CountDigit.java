package practice;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Digit Counter\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int countnumber = countDigit(num);
        System.out.println("Total Digit in your number is " + countnumber);

    }
    public static int countDigit(int num) {
        int i = 0;
        while (num > 0) {
            num /= 10;
            i++;
        }
        return i;
    }
}
