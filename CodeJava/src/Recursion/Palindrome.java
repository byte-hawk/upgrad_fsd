package Recursion;

public class Palindrome {

    public static void main(String[] args){

        System.out.println(isPalindromeIterative("abcba"));
        System.out.println(isPalindromeIterative("abcda"));

        System.out.println(isPalindromeReverse("abcba"));
        System.out.println(isPalindromeReverse("abcda"));

    }

    public static boolean isPalindromeIterative(String str){
        boolean isPalindrome = true;
        int l = 0, r = str.length() - 1;
        while(l<=r) {
            if(str.charAt(l) != str.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        return isPalindrome;
    }

    public static boolean isPalindromeReverse(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

// Print all permutations of characters of a string
