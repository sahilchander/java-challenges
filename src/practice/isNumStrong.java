package practice;

import java.util.Scanner;

public class isNumStrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Strong number checker\n");

        System.out.print("Please enter a number to check: ");
        int num = input.nextInt();
        boolean isStrong = isStrong(num);
        if (isStrong) {
            System.out.println(num + " is an strong Number");
        } else {
            System.out.println(num + " is not strong");
        }
    }

    public static boolean isStrong(int num) {
        int numcopy = num;
        long tempNum = 1; // to Store temp number
        int digitCount = 0; // to count digit
        int i = 1;
        long sum = 0; // Sum of all factorial
        while (num > 0) { // loop start
            digitCount = num % 10;
                while (i <= digitCount) { // inner loop
                    tempNum *= i;
                    i++; // inner loop end
                }num /= 10; // loop end
                i -= digitCount;
            sum += tempNum;
            tempNum -= tempNum - 1;
        }
        return sum == numcopy;
    }
}
