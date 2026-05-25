/*
    Question
    Create a program to find the sum of two diagonal elements.
 */
package Array;

public class SumOfTwoDiagonal {
    public static void main(String[] args) {

        System.out.println("Welcome to sum to diagonal array\n");

        int[][] myArr = ArrayUtility.input2DArray();

        long sum = totalSumOfDiagonal(myArr);
        System.out.println("\n\tDiagonal Sum of your array is " + sum);
    }
    public static long leftDiagonalSum(int[][]myArr){
        int i = 0;
        long sum = 0;
        while (i < myArr.length){
            sum += myArr[i][i];
            i++;
        }
        return sum;
    }
    public static long rightDiagonalSum(int[][]myArr){
        int i = 0;
        int j = myArr.length;
        long sum = 0;
        while (i < myArr.length){
            sum += myArr[i][j-1];
            j--;
            i++;
        }
        return sum;
    }
    public static long totalSumOfDiagonal(int[][]myArr){
        long totalSum = leftDiagonalSum(myArr) + rightDiagonalSum(myArr);
        if (myArr.length % 2 == 0){
            return totalSum;
        }
        int dualNum = (myArr.length/2);
        return totalSum - myArr[dualNum][dualNum];
    }
}
