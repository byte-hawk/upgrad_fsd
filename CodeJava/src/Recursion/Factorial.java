package Recursion;

public class Factorial {

    public static void main(String[] args){
        System.out.println("Factorial Recursive : "+factRecursive(6));
        System.out.println("Factorial Iterative : "+ factIterative(6));
    }

    public static int factRecursive(int n){
        if(n == 1 || n == 0) {
            return 1;
        }
        else {
            return n * factRecursive(n-1);
        }
    }

    public static int factIterative(int n){
        int res = 1;
        for(int i=2; i<= n; i++){
            res = res * i;
        }
        return res;
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
