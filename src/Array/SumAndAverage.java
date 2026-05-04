/*
    Question
    Create a Program to find the sum and average of all elements in an array.
 */
package Array;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String []args){


        System.out.println("\nWelcome to Sum & Average of Array elements\n");

        int[] myArr = ArrayUtility.inputArray();

        int sum = sumOfArray(myArr);
        float average = averageOfArray(myArr);

        System.out.println("\n\t The Sum of all elements is " + sum);
        System.out.println("\n\t The Average of all elements is " + average);
    }
    public static int sumOfArray(int[] myArr){
        int sum = 0;
        int index = 0;
        while (index < myArr.length){
            sum += myArr[index];
            index++;
        }
        return sum;
    }
    public static float averageOfArray(int[] myArr){
        float sum = sumOfArray(myArr);
        return sum/myArr.length;
    }
}
