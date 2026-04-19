package practice;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse number calculator\n");

        System.out.print("Please enter a number your want to reverse: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println(reverse);
    }
    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse*10 + (num%10);
            num /= 10;
        }
        return reverse;
    }
}
