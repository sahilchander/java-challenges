package basics;

import java.util.Scanner;

class ParimeterOfRectangle {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rectangle Perimeter Calulator!\n");
        System.out.println("Please Assume All Sides to Your Rectangle as A,B,C,D Respectively!");

        System.out.print("Please Enter Your A Side: ");
        float aSide = input.nextFloat();
        System.out.print("Now, Please Enter Your B Side: ");
        float bSide = input.nextFloat();
        System.out.print("Now, Please Enter Your C Side: ");
        float cSide = input.nextFloat();
        System.out.print("Now, Please Enter Your D Side: ");
        float dSide = input.nextFloat();

        float peri = aSide + bSide + cSide + dSide;

        System.out.println("Perimeter of Rectangle is: " + peri + "Cm");

    }
}
