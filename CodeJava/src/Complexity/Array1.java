package Complexity;

public class Array1 {

    public static void main(String[] args){
        int[] arr = { 12, 14, 67, 34, -2, 9, 75, 51, 23, -5, 71};

        int[] arr1 = {-11, -5, -7, -4, -190, -4, -6};
        System.out.println(getMaxNum(arr));
    }

    // Get the second maximum number in an array
    public static int getMaxNum(int[] arr) {
        int max = Integer.MIN_VALUE,
                secondMax = Integer.MIN_VALUE;

        System.out.println("Max number is : "+max);
        System.out.println("Second Max number is : "+secondMax);

        for(int i =0; i< arr.length; i++) {
            System.out.println("\nProcessing number : "+arr[i]);
            if(arr[i] > max) {
                System.out.println("Condition 1: Updating second max from " + secondMax
                        + " to " + max);
                secondMax = max;

                System.out.println("Condition 1: Updating max from " + max
                        + " to " + arr[i]);
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] < max){
                System.out.println("Condition 2: Updating second max from " + secondMax
                        + " to " + arr[i]);
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}
