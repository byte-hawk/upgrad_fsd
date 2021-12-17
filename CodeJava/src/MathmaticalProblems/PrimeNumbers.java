package MathmaticalProblems;

public class PrimeNumbers {

    public static void main(String[] args){
        System.out.println(isPrimeNumber(21));
    }

    public static boolean isPrimeNumber(int n){
        boolean isPrime = true;
        n = Math.abs(n);
        if( n == 0 || n == 1)
            return false;

        // Time complexity: O(sqrt(n))
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        // Time complexity: O(n)
        /*for(int i = 2; i <= (n/2); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }*/

        return isPrime;
    }
}
