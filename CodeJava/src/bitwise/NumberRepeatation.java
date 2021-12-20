package bitwise;

public class NumberRepeatation {

    /*
    Q1. You've been give an array, where all numbers except one are present twice.
    The other number is present once. Determine the single number
    */

    /*
    Q2. You've been give an array, where all numbers except one are present twice.
    The other number is present thrice. Determine the number occuring thrice
    */
    public static void main(String[] args){
        int[] arr = {1, -2, -3, -3, -3, -2, 1};
        System.out.println(getSingleNumber(arr));
    }

    public static int getSingleNumber(int[] arr){
        int xor = 0;

        for(int i = 0; i< arr.length; i++){
            xor ^= arr[i];
        }

        return xor;
    }

}
