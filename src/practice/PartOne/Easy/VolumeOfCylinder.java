package practice.PartOne.Easy;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Volume of cylinder calculator");

        System.out.print("Please enter radius of cylinder: ");
        float radius = input.nextFloat();

        System.out.print("Please enter your height of cylinder: ");
        float height = input.nextFloat();

        double volumeOFCylinder = volumeOFCylinder(radius,height);
        System.out.println("Volume of your cylinder is " + volumeOFCylinder);

    }
    public static double volumeOFCylinder (float radius , float height) {
        return (3.14 * radius * radius * height);
    }
}
