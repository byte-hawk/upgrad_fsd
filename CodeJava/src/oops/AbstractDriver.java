package oops;

public class AbstractDriver {

    public static void main(String[] args){
        ConcreteClass cc = new ConcreteClass(5);
        final ConcreteClass cc2 = new ConcreteClass(7);

        // cc2 = new ConcreteClass(5);
        cc2.i = 6;

        cc2.finalMethod();
        System.out.println(cc2.i);

        // cc.sayHello();
        cc.printValue();


    }
}

// Abstract classes can have constructor
// Abstract class can exist even without abstract method
// Abstract class can't be instantiated

// Abstract class should be used to provide skeletal implementation
