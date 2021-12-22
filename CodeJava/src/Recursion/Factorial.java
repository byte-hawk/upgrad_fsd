package Recursion;

public class Factorial {

    public static void main(String[] args){
        System.out.println("Factorial : "+tailFactorial(6, 1));
    }

    public static int fact(int n){
        if(n == 1 || n == 0) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }

    public static int tailFactorial(int n, int res){
        if( n == 0 || n == 1 ){
            return res;
        }
        else{
            return tailFactorial(n-1, res * n);
        }
    }
}
