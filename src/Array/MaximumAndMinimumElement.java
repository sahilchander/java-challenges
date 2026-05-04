/*
    Question
    Create a program to find the maximum and minimum element in an array.
 */

package Array;

public class MaximumAndMinimumElement {
    public static void main(String[] args) {

        System.out.println("\"Welcome to Minimum and Maximum number finder\n");

        int[] myArr = ArrayUtility.inputArray();

        int maximum = maximum(myArr);
        int minimum = minimum(myArr);
        System.out.println("\n\tThe Biggest element is array is " + maximum);
        System.out.println("\n\tThe Smallest element in array is " + minimum);

    }
    public static int maximum(int[] myArr){
        int max = myArr[0];
        int i = 0;
        while (i < myArr.length){
            if (max < myArr[i]){
                max = myArr[i];
            }
            i++;
        }
        return max;
    }

    public static int minimum(int[] myArr){
        int max = maximum(myArr);
        int mini = max;
        int i = 0;
        while (i < myArr.length){
            if (mini > myArr[i]){
                mini = myArr[i];
            }
            i++;
        }
        return mini;
    }
}
