package Complexity;

public class Arrays {

    public static void main(String[] args){
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 8};

        // Get the index of the number:
        // a. 8
        // b. -5
        int number = 15;
        int index = getIndex(arr, number);
        System.out.println("The number "+number+
                (index != -1 ? (" is found at index " + index):
                        " is not present in the array"));
    }

    /**
    * Find the index of a number in an array.
    * If the number is not present in the array, it returns -1
    */
    public static int getIndex(int[] arr, int number){
        int index = -1;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == number){
                index = i;
                break;
            }
        }

        return index;
    }
}
