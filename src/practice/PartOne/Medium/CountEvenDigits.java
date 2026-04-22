package practice.PartOne.Medium;

import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to even digit calculator\n");

        System.out.print("please enter your number: ");
        int num = input.nextInt();

        int countEvenDigit = countEvenDigit(num);
        System.out.println("\n\t There are total \"" + countEvenDigit + "\" even number's in " + num);
    }

    public static int countEvenDigit(int num) {
        int evenCount = 0;
        if (num < 0) {
            num = -num;
        }
        while (num > 0) {
            if(num % 2 == 0){
                evenCount++;
            }num /= 10;
        }
        return evenCount;
    }
}