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
    public static void displayArray(int[] myArr){
        int i = 0;
        while (i < myArr.length){
            System.out.print(myArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
