package practice.PartOne.Medium;

import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to product of digit calculator");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int product = productOfDigits(num);

        if (num <= 0) { // i add this because i don't want any errors (i know i can remove this and the answer will be always 1 )
            System.out.println("\n\t Product of " + num + " is 0");
        } else {
            System.out.println("\n\t Product of " + num + " is " + product);
        }
    }
    public static int productOfDigits(int num) {
        int product = 1;
        while (num > 0) {
            product = (num%10) * product ;
            num /= 10;
        }
        return product;
    }
}

