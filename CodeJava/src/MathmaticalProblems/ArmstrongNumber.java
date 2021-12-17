package MathmaticalProblems;

public class ArmstrongNumber {

    public static void main(String[] args){
        System.out.println(isArmstrongNumber(8));

        System.out.println((int) Math.ceil(Math.log(153) / Math.log(10)));
    }

    // Time complexity: O(number of digits)  == O(log10 n)
    public static boolean isArmstrongNumber(int n) {
        int noOfDigits = String.valueOf(n).length();
        int num = n, sum = 0;
        while (num != 0) {
            sum = sum + (int) Math.pow(num % 10, noOfDigits);
            num=num/10;
        }

        return sum == n;
    }
}
