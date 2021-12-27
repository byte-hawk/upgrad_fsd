package Sorting;

public class MergeSortedArrays {

    public static void main(String[] args){
        int[] arr1 = {-4,-1,0,1,1,2,8,11,19,23,99,99};
        int[] arr2 = {-9,-9,-3,2,4,6,7,8,97,111,122};
        int[] mergedArray = getMergedSortedArray(arr1, arr2);
        for(int i: mergedArray){
            System.out.print(i+" ");
        }
    }

    // Time complexity: O(n+m)
    // Space complexity: O(n+m)
    public static int[] getMergedSortedArray(int[] L, int[] R) {
        int i=0, j=0, k=0;
        int[] res = new int[L.length +R.length];

        // while there's at least one element in each of the array to compare
        while(i < L.length && j < R.length) {
            if (L[i] <= R[j])
                res[k++] = L[i++];
            else
                res[k++] = R[j++];
        }

        // left array is completely processed,
        // copying leftover elements from the right array
        while(j < R.length)
            res[k++] = R[j++];

        // right array is completely processed,
        // copying leftover elements from the left array
        while(i < L.length)
            res[k++] = L[i++];

        return res;
    }

}
