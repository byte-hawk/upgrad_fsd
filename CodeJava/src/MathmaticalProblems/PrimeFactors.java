package MathmaticalProblems;

public class PrimeFactors {
    public static void main(String[] args){
        printPrimeFactors(7);
    }

    // Time complexity: )(n)
    public static void printPrimeFactors(int n){

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(isPrimeNumber(i)){
                    System.out.println(i);
                }
                if(i != n/i && isPrimeNumber(n/i)){
                    System.out.println(n/i);
                }
            }
        }

    }

    // Time complexity: O(sqrt(n))
    public static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        n = Math.abs(n);
        if (n == 0 || n == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
// Sieve of Erasthomas