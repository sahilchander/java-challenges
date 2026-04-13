package practice;
import java.util.Scanner;

public class GptTest3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to +10 Calculator!!");
        System.out.print("Please Enter your First Number: ");
        int fisrtNum = input.nextInt();
        int sum = fisrtNum + 10;
        System.out.print(sum);
    }
}
