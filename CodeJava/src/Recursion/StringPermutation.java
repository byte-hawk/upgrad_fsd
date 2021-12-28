package Recursion;

public class StringPermutation {

    public static void main(String[] args){
        String str = "abc";
        char[] charArray = str.toCharArray();
        printStringPermutation(charArray,0 , charArray.length-1);
    }

    public static void printStringPermutation(char[] str, int left, int right){
        if(left == right){
            System.out.println(str);
            return;
        }

        for(int i = left; i<= right; i++){
            // Swap ith & lth character
            swap(str, i, left);

            // permute string from l+1 to r
            printStringPermutation(str, left+1, right);

            // Swap back ith & lth character
            swap(str, i, left);
        }

    }

    public static void swap(char[] str, int l, int r){
        char leftChar = str[l];
        str[l] = str[r];
        str[r] = leftChar;
    }
}
