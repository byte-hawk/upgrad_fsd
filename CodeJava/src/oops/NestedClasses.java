package oops;

public class NestedClasses {

    int a = 10;
    public int b = 15;
    private int c = 20;
    protected int d = 25;

    static int e = 10;
    static public int f = 15;
    static private int g = 20;
    static protected int h = 25;

    static class StaticNestedClass {
        int i = h;

        // it can access only the static variables from parent/wrapper class
        // Static nested classes can be defined as public/private/default/protected
        // Static Nested classes can have both static and non-static members

    }

    class InnerClass {

        int j = 1;

        // Inner class can access both static and non-static variables from parent/wrapper class
        // Inner classes can be defined as public/private/default/protected
        // Inner class can have only non-static members
    }

    public static void main(String[] args){
        new NestedClasses().test();
    }

    public void test(){
        InnerClass ns2 = new InnerClass();
        ns2.j = 2;
        test2(ns2);

    }

    public void test2(InnerClass ns2){
        System.out.println("j : " + ns2.j);

        class LocalClass {
            int k = h;

            // Local class can access both static and non-static variables from parent/wrapper class
            // Local classes can't have any access modifier, it can't also be static
            // Local class can have only non-static members
        }

        LocalClass ns3 = new LocalClass();


    }
}



// There can be only 1 public class in single file
// The name of the public class should match with the file name
