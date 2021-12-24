package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 3, 2, 8, -2};
        int n= arr.length, min_index, temp;

        for(int i=0;i<n;i++) {
            min_index=i;
            for (int j=i;j<n;j++) {
                if(arr[j]<arr[min_index]) {
                    min_index=j;
                }
            }

            if(arr[i]>arr[min_index])
            {
                temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Given 2 sorted arrays of integer numbers, merge them into another sorted array