package practice.PartOne.Easy;

import java.util.Scanner;

public class SubjectPassingCriteria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Result Checker\n");

        System.out.print("Please enter your marks of hindi: ");
        int hindimark = input.nextInt();

        System.out.print("Please enter your marks of english: ");
        int englishmark = input.nextInt();

        System.out.print("Please enter your marks of maths: ");
        int mathsmark = input.nextInt();

        boolean checkresult = checkPass(hindimark , englishmark , mathsmark);
        float average = average(hindimark , englishmark , mathsmark);

        if (hindimark > 100 || englishmark > 100 || mathsmark > 100) { // verification of marks
//        if (hindimark > 100 || hindimark < 0 || englishmark > 100 || englishmark < 0 || mathsmark > 100 || mathsmark < 0) { // verification of marks
            System.out.println("Please enter valid marks");
        } else if (checkresult && (average > 50)) { //condition check
            System.out.println("Congratulations your passed in your exam & your got " + average + "%");
        } else {
            System.out.println("Your failed, better luck next time");
        }

    }
    public static boolean checkPass(int hindimark , int englishmark , int mathsmark) {
        if (hindimark > 40 && englishmark > 40 && mathsmark > 40) {
            return true;
        }
        return false;
    }
    public static float average (int hindimark , int englishmark , int mathsmark) {
        float average = (float) (hindimark + englishmark + mathsmark)/3;
        return average;
    }
}