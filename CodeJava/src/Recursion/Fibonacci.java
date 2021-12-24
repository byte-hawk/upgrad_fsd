package Recursion;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println(fibonacciTail(7, 0 , 1));
    }

    public static int fibonacci(int n) throws Exception {
        if(n<0) {
            throw new Exception("n is negative");
        }
        if(n==0)
            return 0;
        else if(n==1)
            return 1;

        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int fibonacciTail(int n, int res1, int res2) throws Exception{

        if(n<0) {
            throw new Exception("n is negative");
        }
        if(n==0)
            return res1;
        else if(n==1)
            return res2;

        else
            return fibonacciTail(n-1, res2, res1+res2);
    }
}

// Check whether a string is palindrome or not
// abcdba
