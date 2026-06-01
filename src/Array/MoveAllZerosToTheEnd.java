/*
    Question
    Move All Zeros to the End (In-Place) Write a program that takes an array of integers that
    contains several 0s mixed with other numbers. Modify the array so that all the 0s are pushed to the very end,
    while keeping the original order of all the non-zero elements intact. Constraint: You must do this
    without creating a new array (In-place modification).
 */
package Array;

public class MoveAllZerosToTheEnd {
    public static void main(String []Args){

        System.out.println("Welcome to Zero to the End in an Array: ");

        int[] myArr = ArrayUtility.inputArray();

        ArrayUtility.displayArray(zeroArr(myArr));

    }
    public static int[] zeroArr(int[] myArr){
        int i = 0;
        while (i < myArr.length){
            if (myArr[i] == 0){
                int j = i+1;
                while (j < myArr.length){
                    if (myArr[j] != 0){
                        myArr[i] = myArr[j];
                        myArr[j] = 0;
                        break;
                    }
                    j++;
                }
            }
            i++;
        }
        return myArr;
    }
}
