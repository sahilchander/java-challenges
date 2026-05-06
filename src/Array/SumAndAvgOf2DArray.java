/*
    Question
    Create a program to do sum and average of all elements in a 2-D array.
 */
package Array;

public class SumAndAvgOf2DArray {
    public static void main(String[] args) {

        System.out.println("Welcome to Sum & Average Calculator\n");

        int[][] myArr = ArrayUtility.input2DArray();

        long sum = ofSum(myArr);
        double avg = ofAverage(myArr);

        System.out.println("\n\tSum of Array is " + sum);
        System.out.println("\n\tAverage of Array is " + avg);

    }
    public static long ofSum(int[][]myArr){
        int i = 0;
        long sum = 0;
        while (i < myArr.length){
            int j =0;
            while (j < myArr[i].length){
                sum += myArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double ofAverage(int[][]myArr){
        if (myArr.length == 0 ){
            return 0;
        }
        int row = myArr.length;
        int cols = myArr[0].length;
        double size = row * cols;
        return ofSum(myArr)/size;
    }
}
