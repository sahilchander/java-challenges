package practice.PartOne.Easy;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area and perimeter of square calculator");

        System.out.print("Please enter side of your square: ");
        float side = input.nextFloat();

        calculateAreaAndPerimeter(side);
    }
    public static void calculateAreaAndPerimeter(float side) {
        float areaOfSquare = side * side ;
        float perimeterOfSquare = side * 4;

        System.out.println("\n\t Area Of Square is " + areaOfSquare + "\n\t Perimeter of square is " + perimeterOfSquare);
    }
}
