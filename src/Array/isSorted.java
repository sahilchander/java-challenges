/*
    Question
    Create a program to check if the given array is sorted.
 */

package Array;
import java.util.Scanner;


public class isSorted {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Sorted Checker\n");

        int[] myArr = ArrayUtility.inputArray();

        boolean isSorted = isSort(myArr);
        boolean isSorted2 = isSort2(myArr);
        if (isSorted || isSorted2){
            System.out.println("\n\tyour Array is sorted");
        }
        else {
            System.out.println("\n\tyour Array is not sorted");
        }


    }
    public static boolean isSort(int[] myArr){
        int i = 0;
        int j = 1;
        while (j < myArr.length){
            if (myArr[i] >= myArr[j]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static boolean isSort2(int[] myArr){
        int i = 0;
        int j = 1;
        while (j < myArr.length){
            if (myArr[i] <= myArr[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
