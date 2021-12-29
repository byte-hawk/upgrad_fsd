package Sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {-22, 12, -99, 3, -22, 38, 5, -92, 0, 87, 43, 76, 2};
        quickSort(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int[] arr, int l, int r){
        if(l<r) {
            int pi = partition(arr,l, r);
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);
        }
    }

    public static int partition(int[] arr, int l, int r){
        int p = arr[r], i = l-1;

        for(int j = l; j<r; j++){
            if(arr[j] < p){
                i++;

                if(arr[i] > p) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }
}
