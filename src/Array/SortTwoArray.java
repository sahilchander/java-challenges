package Array;

public class SortTwoArray {
    public static void main(String[] args) {

        System.out.println("Welcome to two sorted array\n");

        int [] numArr = ArrayUtility.inputArray();
        int [] numArr2 = ArrayUtility.inputArray();

        int[] sortedArray = sortedArray(numArr, numArr2);

        ArrayUtility.displayArray(sortedArray);
    }

    public static int[] sortedArray(int[] numArr, int[] numArr2) {
        int newSize = numArr.length + numArr2.length;
        int[] sorted = new int[newSize];

        int i = 0, j = 0, k = 0;

        while (i < numArr.length && j < numArr2.length) {
            if (numArr[i] <= numArr2[j]) {
                sorted[k++] = numArr[i++];
            } else {
                sorted[k++] = numArr2[j++];
            }
        }

        while (i < numArr.length) {
            sorted[k++] = numArr[i++];
        }


        while (j < numArr2.length) {
            sorted[k++] = numArr2[j++];
        }

        return sorted;
    }
}