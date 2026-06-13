/*
    Question
    Target Pair Sum (Two Sum) (Write a program that takes an array of integers and a target number from the user.
    Check if there are any two distinct elements in the array that add up exactly to the target number.
    If such a pair exists, print true, otherwise print false.
*/
package Array;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\n\t Welcome to the Two Sum Array Calculator: ");

        int[] myArr = ArrayUtility.inputArray();

        System.out.print("Please enter your target number: ");
        int tar = input.nextInt();

        boolean isTwoSum = isTwoSum(myArr,tar);

        if (isTwoSum){
            System.out.println("\n\t Two Sum Target is in Array");
        }else {
            System.out.println("\n\t Two Sum Target is \"Not\" in Array");
        }
    }
    public static boolean isTwoSum (int[] myArr , int tar){
        int i = 0;
        while (i < myArr.length){
            int j = i+1;
            while (j < myArr.length){
                if (myArr[i] + myArr[j] == tar){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
