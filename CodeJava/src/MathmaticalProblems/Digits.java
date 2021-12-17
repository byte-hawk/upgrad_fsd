package MathmaticalProblems;

public class Digits {
    public static void main(String[] args){
        printDigitStats(0);
    }

    public static void printDigitStats(int n){
        n = Math.abs(n);
        int sum = 0, highestDigit = 0, numberOfDigits = 0;
        while (n != 0) {
            highestDigit = Math.max(highestDigit, n % 10);
            sum = sum + n % 10;
            n=n/10;
            numberOfDigits++;
        }
        System.out.println("Sum of digits : "+sum);
        System.out.println("Biggest digit : "+ highestDigit);
        System.out.println("Number of digits : "+ (numberOfDigits == 0? 1: numberOfDigits));

        int numOfDigits = String.valueOf(n).length();
        System.out.println("Number of digits : "+numOfDigits);
    }
}
