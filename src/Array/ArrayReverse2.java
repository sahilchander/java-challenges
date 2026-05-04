/*
    Question
    Create a program to reverse an array.(Without any new array)
 */
package Array;

import java.util.Scanner;

public class ArrayReverse2 {
    public static void main(String[] args) {

        System.out.println("Welcome to array reversal\n");
        int[] myArr = ArrayUtility.inputArray();
        reversalArray(myArr);
        System.out.println("Your reversed array is ");
        ArrayUtility.displayArray(myArr);

    }
    public static void reversalArray(int[] myArr){
        int i = 0;
        int j = myArr.length-1;
        while (i < myArr.length/2){
            int arrStore =  myArr[i];
            myArr[i] = myArr[j];
            myArr[j] = arrStore;
            i++;
            j--;
        }
    }
}
