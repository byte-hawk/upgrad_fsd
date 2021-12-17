package MathmaticalProblems;

public class OwnPower {

    public static void main(String[] args){
        System.out.println(power( 2, 0));
    }

    // Test case 1: Negative Power
    // Food for thought: return type may long as well
    public static int power(int num, int power){
        int res = 1;
        for (int i = 1; i <= power; i++)
            res *= num;

        return res;
    }
}
