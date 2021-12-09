package Calculator;

public class Calculator {

    // Anonymous class
    static Operator adder = new Operator(){
        @Override
        public int operate(int a, int b){
            return a + b;
        }
    };

    // Anonymous class
    static Operator subtractor = new Operator(){
        @Override
        public int operate(int a, int b){
            return a - b;
        }
    };

    public static void main(String[] args){

        int a = 2, b = 5;
        int adResult = calculate(a, b, adder);
        int subResult = calculate(b, a, subtractor);

        System.out.println(a +" + "+b + " = "+adResult);
        System.out.println(b +" - "+a + " = "+subResult);

    }

    public static int calculate(int a, int b, Operator operator){
        return operator.operate(a, b);
    }
}
