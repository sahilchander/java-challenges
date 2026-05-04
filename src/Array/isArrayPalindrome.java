/*
    Question
     Create a program to check is the array is palindrome or not.
 */
package Array;

public class isArrayPalindrome {
    public static void main(String[] args) {

        System.out.println("Welcome to palindrome Checker of an array\n");

        int[] myArr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(myArr);

        if (isPalindrome){
            System.out.println("\n\tYour Array is a palindrome");
        }else {
            System.out.println("\n\tYour Array is not palindrome");
        }
    }
    public static boolean isPalindrome(int[] myArr){
        int i = 0;
        int j = myArr.length-1;
        while (i < myArr.length/2){
            if (myArr[i] == myArr[j]){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
