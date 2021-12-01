package oops;

public class Polymorphism {

    public int add(int a, int b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    public float add(int a, float ...b){
        float sum = a;


        for(float num: b){
            sum = sum + num;
        }

        return sum;
    }

    public long add(long a, long b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public void execute(Mammals m){

        m.setHeight(2.1f);
    }

    public static void main(String[] args){
        Polymorphism p = new Polymorphism();
        int a = 3, b=5;
        System.out.println("3+5 = "+p.add(a, b));
        System.out.println("a = "+a);

        Mammals m = new Mammals(4.5f, 71);
        p.execute(m);
        System.out.println("height = "+m.getHeight());
        System.out.println("3.2f+5.1 = "+p.add(3.2f,5.1));
        System.out.println("3.5d+5 = "+p.add(3.5d,5));
        System.out.println("3l+5 = "+p.add(3l,5));
        //System.out.println("3+5+7 = "+p.add(3,5.1f, 7.2f, 12.3f, 15.2f));
    }

}
