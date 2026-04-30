/*
    Question
    Sum of Prime Digits: Input a large number. Separate its digits. Add only the prime digits (2, 3, 5, 7)
    and print the sum. (Method will be used inside a loop).
 */
package practice.PartOne.Hard;
import java.util.Scanner;

public class SumofPrimeDigits {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime sum Calculator");

        System.out.print("Please enter you're number: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("\n\tPlease enter number above \"0\"");
            return;
        }

        int primeSum = primeSum(num);

        if (primeSum == 0) {
            System.out.println("There is No prime number in \"" + num + "\"");
            return;
        }

        System.out.println("Sum of all Prime number is " + primeSum);

    }
    public static int primeSum(int num){
        int checkPrime = 0;
        int sumPrime = 0;
        while (num > 0){
            checkPrime = num % 10;
            if (checkPrime == 2 || checkPrime == 3 || checkPrime == 5 || checkPrime == 7){
                sumPrime += checkPrime;
            }
            num /= 10;
        }
        return sumPrime ;
    }
}