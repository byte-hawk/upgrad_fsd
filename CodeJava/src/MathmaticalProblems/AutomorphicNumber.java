package MathmaticalProblems;

public class AutomorphicNumber {

    public static void main(String[] args){
        System.out.println(isAutomorphicNumber(16));
    }

    public static boolean isAutomorphicNumber(int n){
        long square = (long) Math.pow(n , 2);
        return String.valueOf(square).endsWith(String.valueOf(n));
    }
}
