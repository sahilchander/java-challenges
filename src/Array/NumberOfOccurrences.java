/*
    Question
    Create a program to find number of occurrences of an element in an array.
 */

package Array;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Number of occurrences of an array\n");

        int[] myArr = ArrayUtility.inputArray();

        System.out.print("\nPlease enter the number you want to find Occurrences: ");
        int num = input.nextInt();

        int isOccurrence = isOccurrence(myArr, num);

        System.out.println(num + " is found \"" + isOccurrence + "\" times is in Array");

    }

    public static int isOccurrence(int[] myArr, int num){
        int i = 0;
        int count = 0;
        while (i < myArr.length){
            if (num == myArr[i]){
                count++;
            }
            i++;
        }
        return count;
    }

}
