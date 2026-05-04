/*
    Question
    Create a program to return a new array deleting a specific element. (With int[] return type)
 */
package Array;

import java.util.Scanner;

public class DeletingAnArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array element deleter\n");

        int[] myArr = ArrayUtility.inputArray();

        System.out.print("Now, please enter the number you want to delete: ");
        int num = input.nextInt();

        int[] newArr = deleteElement(myArr,num);
        System.out.println ("Here is your new array");
        ArrayUtility.displayArray(newArr);


    }
    public static int[] deleteElement(int [] myArr,int num){
        int occ = NumberOfOccurrences.isOccurrence(myArr,num);
        if (occ == 0){
            return myArr;
        }
        int newSize = myArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0;
        int j = 0;
        while (i < myArr.length) {
            if ( myArr[i] != num){
                newArr[j] = myArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
