package basics;

import java.util.Scanner;

class SimpleInterest {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator!");
        System.out.print("Please Enter Your Principal Amount: ");
        double priAmount = input.nextDouble();
        System.out.print("Please Enter The Interest Rate: ");
        double priRate = input.nextDouble();
        System.out.print("Please Enter Your Time (in Years)");
        int priTime = input.nextInt();

        double total = (priAmount * priTime * priRate)/100;

        System.out.println("\nYour Simple Interest is " + total);

    }
}
