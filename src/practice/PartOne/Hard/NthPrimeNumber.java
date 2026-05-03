/*
    Question
    Nth Prime Number: Input a number N from the user. You don't want to print the first N prime numbers,
    but rather print the prime number in the exact N-th position. (e.g., if N=5 then the 5th prime number is 11).
 */
package practice.PartOne.Hard;

import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String []Args){

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Nth Prime number finder\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int nthPrime = nthPrime(num);
        System.out.println("The prime number on \"" +num + "\" position is " + nthPrime);
    }
    public static int nthPrime(int num) {
        int count = 0;
        int currentNumber = 2;
        int prime = 0;
        while (count < num){
            if (isPrime(currentNumber)){
                count++;
                prime = currentNumber;
                currentNumber++;
            }else {
                currentNumber++;
            }
        }
        return prime;
    }
    public static boolean isPrime(int currentNumber) {
        int i = 2;
        while (i < currentNumber) {
            if (currentNumber% i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}