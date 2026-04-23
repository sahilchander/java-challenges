/*
    Question:
    Create a program to calculate the Area of a Triangle.
*/
package basics;

import java.util.Scanner;

class AreaofTriangle {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Triangle Area Calculator!!\n");
        System.out.print("Please Enter the Height Of Your Triangle: ");
        float triHeight = input.nextFloat();
        System.out.print("Now, Please Enter Your Base of Your Triangle: ");
        float triBase = input.nextFloat();

        double area = 0.5 * triBase * triHeight;

        System.out.println("Area of Your Triangle is " + area + "cm²");
    }
}
