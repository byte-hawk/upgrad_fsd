package Complexity;

public class TestOverflow {

    public static void main(String[] args){
        int r = Integer.MAX_VALUE, l = (Integer.MAX_VALUE - 9);

        System.out.println("Direct Mid : "+(l+r)/2);
        System.out.println("Direct Mid : "+(l + ((r-l) / 2)));


        long rl = Integer.MAX_VALUE, ll = (Integer.MAX_VALUE - 9);
        long suml = (rl + ll);
        long mid2 = suml/2;
        System.out.println("Mid 2 : "+(int) mid2);

        // TO make an object of a class as final,
        // 1. make the class as final
        // 2. make all attributes of the class as final
        // 3. Do not create public setter methods

        // If the class is final, then the class can't be sub-classed
        // If an attribute is final -> it can't be updated

    }
}
