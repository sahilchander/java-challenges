package numberlogic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse number calculator");

        System.out.print("Please enter your number to reverse: ");
        int num = input.nextInt();
        int reverse = Reverse(num);
        System.out.println("The Reverse Of Your Number is " + reverse);

    }
    public static int Reverse(int num) {
        int rev = 0;
        while (num > 0){
            rev = rev + (num%10);
            num /= 10;
            rev *=10;
        }
        rev /= 10;
        return rev;
    }
}
