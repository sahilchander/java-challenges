/*
    Question:
    Create a program that calculates grades based on marks
    A -> above 90% B -> above 75%
    C -> above 60% D -> above 30%
    F -> below 30%
*/
package conditions;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Checker!!\n");

        System.out.print("Please Enter Your Marks: ");
        int marks = input.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("\n\t Please Enter Valid Marks!!");
        } else if (marks >= 90) {
            System.out.println("\n\t Congratulation Your Got \"A\" ");
        } else if (marks >= 75 ) {
            System.out.println("\n\t Congratulation Your Got \"B\" ");
        } else if (marks >= 60 ) {
            System.out.println("\n\t  Your Got \"C\" ");
        } else if (marks >= 30 ) {
            System.out.println("\n\t  Your Got \"D\" ");
        } else {
            System.out.println("\n\t Your Failed");
        }
    }
}
