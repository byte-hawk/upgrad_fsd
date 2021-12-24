package Sorting;

public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {5, 2, 9, 3, 2, 8, -2};
        int temp, n = arr.length;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < (n-1) - i; j++){

                if(arr[j] > arr[j+1]) {
                    // Swap arr[j] with arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
