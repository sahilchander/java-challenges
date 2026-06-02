/*
    Question
    Given an integer array, print all elements that appear more than once.
    Input: [4, 3, 2, 7, 8, 2, 3, 1]
    Output: [2, 3]
 */
package Array;

public class AppearTwice {
    public static void main(String []args){

        System.out.println("Welcome to the AppearTwice Calculator!");

        int[] myArr = ArrayUtility.inputArray();

        ArrayUtility.displayArray(moreThanOne(myArr));
    }
    public static int[] moreThanOne (int[] myArr){
        int i = 0;
        int j = 1;
        int[] twiceArr = new int[myArr.length];
        while (i < myArr.length){
            while (j < myArr.length){
                if (myArr[i] == myArr[j]){
                    twiceArr[i] = myArr[j];
                    break;
                }
                j++;
            }
            i++;
        }
        return twiceArr;
    }
}
