/*
    Question
    Given an integer array, print all elements that appear more than once.
    Input: [4, 2, 3, 7, 8, 2, 3, 1]
    Output: [2, 3]
 */
package Array;

public class AppearTwice {
    public static void main(String []args){

        System.out.println("Welcome to the AppearTwice Calculator!");

        int[] myArr = ArrayUtility.inputArray();

        moreThanOne(myArr);
    }
    public static void moreThanOne (int[] myArr){
        int i = 0;
        while (i < myArr.length){
            int j = i+1;
            while (j < myArr.length){
                if (myArr[i] == myArr[j]){
                    System.out.print(myArr[i] + " , ");
                    break;
                }
                j++;
            }
            i++;
        }

    }
}

