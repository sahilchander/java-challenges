/*
    Question
    Create a program to return a new array deleting a specific element. (With Void return method)
 */
package Array;

import java.util.Scanner;

public class DeletingAElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array element deleter\n");

        int[] myArr = ArrayUtility.inputArray();

        System.out.print("Please enter a to delete from an array: ");
        int num = input.nextInt();

        boolean isInArray = isInArray(myArr, num);
        if (isInArray){
            System.out.println("\n\tYour number is \"not\" in a Array");
        }else {
            System.out.print("\n\tYour new array is ");
            deleteElement(myArr, num);
        }

    }
    public static void deleteElement(int[] myArr, int num){
        int i = 0;
        while (i < myArr.length){
            if (myArr[i] == num){
                myArr[i] = 0;
            }i++;
        }
        int j = 0;
        while (j < myArr.length){
            if (myArr[j] != 0){
                System.out.print(myArr[j] + " ");
            }j++;
        }
    }
    public static boolean isInArray(int[] myArr ,int num){
        int i = 0;
        while (i < myArr.length){
            if (num == myArr[i]){
                return false;
            }i++;
        }
        return true;
    }
}
