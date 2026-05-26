/*
    Question
    Find the Second-Largest Element (Write a program to find the strictly Second-largest element in an array of integers.
    Constraint: You cannot sort the array, and you should try to
    find it in a single loop traversal just by managing variables smartly!)
 */
package Array;
public class SecondLargestElement {
    public static void main(String []Args){

        System.out.println("Welcome To Second Largest Element Finder: ");

        System.out.println("\n\tEntering Negative Number May occurs Wrong output!!");

        int[] myArr = ArrayUtility.inputArray();

        int secLargest = secondNum(myArr);
        System.out.println("Second largest number in array is " + secLargest);
    }
    public static int secondNum (int[] myArr){
        int i = 0;
        int lar = 0;
        int secLar = 0;
        while (i < myArr.length){
            if (myArr[i] > lar){
                secLar = lar;
                lar = myArr[i];
            }else {
                if (myArr[i] > secLar && myArr[i] != lar){
                    secLar = myArr[i];
                }
            }
            i++;
        }
        return secLar;
    }
}
