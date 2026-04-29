/*
    Question
    Count Set Bits (Bitwise): Take an integer from the user. Use bitwise operators (& and >> right shift)
    to count how many '1's (set bits) are there in its binary representation.
 */
package practice.PartOne.Hard;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bit count\n");

        System.out.print("Please enter a number to checker: ");
        int num = input.nextInt();

        int countSet = countSet(num);
        System.out.println("total number of \"1\" bits in " + num + " is " + countSet);
    }
    public static int countSet(int num){
        int count = 0;
        while (num > 0){
            if ((num & 1) == 1){
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
