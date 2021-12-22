package Recursion;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println(fibonacci(7));
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
}
