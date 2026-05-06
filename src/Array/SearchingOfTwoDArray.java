/*
    Question
    Create a program to search an element in a 2-D array.
 */
package Array;
import java.util.Scanner;

public class SearchingOfTwoDArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Searching of 2D array\n");

        int[][] myArr = ArrayUtility.input2DArray();

        System.out.print("please enter the number you want to search: ");
        int num = input.nextInt();

        boolean isFound = isFound(myArr,num);

        if (isFound){
            System.out.println(num + " is found in our array");
        }else {
            System.out.println(num + " is not found in our array");
        }
    }
    public static boolean isFound(int[][] myArr, int num){
        int i = 0;
        while (i < myArr.length){
            int j = 0;
            while (j < myArr[i].length){
                if (num == myArr[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
