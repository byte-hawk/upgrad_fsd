package Complexity;

public class SpaceSample {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
        reverseArray(arr);

    }

    // arr is input array - don't consider it for space complexity
    // new primitive variables created: 3
    // Array created = 1(revArr)
    public static void reverseArray(int[] arr){
        int[] revArr = new int[arr.length];
        int index = 0;
        for(int i = arr.length-1; i>=0; i--){
            revArr[index] = arr[i];
            index++;
        }

        for(int i = 0; i<revArr.length; i++)
            System.out.print(revArr[i]+"\t");
    }
}
