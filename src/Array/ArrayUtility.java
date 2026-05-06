package Array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int arr = input.nextInt();

        int[] myArr = new int[arr];

        int i = 0;
        while (i < myArr.length) {
            System.out.print("please enter element no " + (i + 1) + ": ");
            myArr[i] = input.nextInt();
            i++;
        }
        return myArr;
    }


    public static int[][] input2DArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of Row: ");
        int row = input.nextInt();

        System.out.print("Please enter the number of Columns: ");
        int col = input.nextInt();

        int[][] my2dArr = new int[row][col];

        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < col) {
                System.out.print("Please the element of Row " + (i + 1) + ": & column " + (j+1) + ": ");
                my2dArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return my2dArr;
    }


    public static void displayArray(int[] myArr){
        int i = 0;
        while (i < myArr.length){
            System.out.print(myArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
