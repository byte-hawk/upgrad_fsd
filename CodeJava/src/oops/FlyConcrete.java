package oops;

public class FlyConcrete implements Flyable{

    @Override
    public void fly() {
        System.out.println("I can fly till "+ i + " meter height from land.");
    }

    public void ownMethod(){

        Flyable.super.implementedmethod();
        System.out.println("Own method");
    }
}

