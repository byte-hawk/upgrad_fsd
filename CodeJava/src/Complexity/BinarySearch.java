package Complexity;

public class BinarySearch {
    public static void main(String[] args){
    //                  0  1  2  3  4  5  6  7  8  9  10  11  12  13
        int[] arr1 = {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15};
        int[] arr = {1, 2, 4, 7, 9, 10, 12, 13, 15};
        // firstIndex = 0, lastIndex= 5, number of occurence= lastIndex - firstIndex + 1
        int[] descArr = {15, 13, 12, 10, 9, 7, 4, 2, 1};

        int number = 8;
        int index = getFirstIndexBinarySearchAscending(arr1, number);
        System.out.println(index == -1 ? ("The number " + number + " is not present in the array."):
                ("Got the number "+ number +" at index position "+index));
    }

    public static int getIndexFromAscendingBinarySearch(int[] arr, int number){
        int index = -1;

        int l=0, r = arr.length - 1, mid;
        while(l <= r){
            System.out.println("l = "+l+", r = "+r);
            mid = l + ((r-l) / 2);

            // base condition
            if(arr[mid] == number){
                index = mid;
                break;
            }
            else if(arr[mid] > number){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return index;
    }

    public static int getIndexFromDescendingBinarySearch(int[] arr, int number){
        return -1;
    }

    public static int getFirstIndexBinarySearchAscending(int[] arr, int number){
        // If the number is repeated in the array, return the left most index,
        // i.e. for the array
        // {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15} -> return 0
        //               0  1  2  3  4  5  6  7  8  9  10  11  12  13
        // int[] arr1 = {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15};
        int index = -1, l=0, r = arr.length - 1, mid;
        while(l <= r){
            mid = l + ((r-l) / 2);
            System.out.println("l = "+l+", r = "+r+", mid = "+mid+", arr[mid] =  "+arr[mid]);

            // base condition
            if(arr[mid] == number && (mid == 0 || arr[mid-1] < arr[mid])){
                index = mid;
                break;
            }
            else if(arr[mid] >= number){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return index;
    }
}
