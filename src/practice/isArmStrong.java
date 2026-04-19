package practice;

import java.util.Scanner;

public class isArmStrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ArmStrong number checker\n");

        System.out.print("Please enter your to check: ");
        int num = input.nextInt();
        boolean isArmStrong = isArmstrong(num);
        if (isArmStrong) {
            System.out.println(num + " is a ArmStrong number");
        }else {
            System.out.println(num + " is not a ArmStrong number");
        }
    }
    public static boolean isArmstrong (int num) {
        int digit = digit(num);
        int numcopy = num;
        int sum = 0;
        while (num > 0) {
            sum += (int )Math.pow((num%10),digit);
            num /= 10;
        }
        return numcopy == sum;
    }
    public static int digit(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
