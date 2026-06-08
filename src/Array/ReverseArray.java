/*
    Question
    Create a program to reverse an array. (With New array method)
 */
package Array;

public class ReverseArray {
    public static void main(String[] args) {


        System.out.println("Welcome to array reversal\n");
        int[] myArr = ArrayUtility.inputArray();

        int[] newArr = reverse(myArr);

        ArrayUtility.displayArray(newArr);

    }
    public static int[] reverse(int[] myArr){
        int i = myArr.length;
        int j = 0;
        int[] newArray = new int[myArr.length];
        while (i > 0){
            newArray[j] = myArr[i-1];
            i--;
            j++;
        }
        return newArray;
    }
}
