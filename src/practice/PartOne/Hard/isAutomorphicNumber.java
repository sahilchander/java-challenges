/*
    Question
    Automorphic Number: A number is automorphic if its square ends with the same number.
    (e.g., 5 -> Square is 25 (ends with 5). 25 -> Square is 625 (ends with 25)). Please check user input.
 */
package practice.PartOne.Hard;
import java.util.Scanner;

public class isAutomorphicNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Automorphic Number checker\n");

        System.out.print("Please enter you're number to check: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("\n\tPlease enter a \"valid\" number");
            return;
        }

        boolean isAutomorphic = isAutomorphic(num);
        if (isAutomorphic) {
            System.out.println(num + " is a \"Automorphic\" number");
        } else {
            System.out.println(num + " is \"Not\" a automorphic number");
        }
    }

    public static boolean isAutomorphic(int num) {
        long numSquare = (long)num * num;
        while (num > 0){
            if (num % 10 != numSquare % 10){
                return false;
            }else {
                num /= 10;
                numSquare /= 10;
            }
        }
        return true;
    }
}
