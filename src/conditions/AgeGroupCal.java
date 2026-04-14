package conditions;

import javax.xml.transform.Source;
import java.util.Scanner;

public class AgeGroupCal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Group Finder!\n");

        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();

        if (age < 0 || age > 150) {
            System.out.println("\n\t Please Enter a valid Age");
        } else if (age <= 13) {
            System.out.println("\n\t You'r Age Group is Child");
        } else if (age <= 20) {
            System.out.println("\n\t You'r Age Group is Teen");
        } else if (age <= 60) {
            System.out.println("\n\t You'r Age Group is Adult");
        } else {
            System.out.println("\n\t You'r Age Group is Senior");
        }
    }
}
