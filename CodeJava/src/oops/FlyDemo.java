package oops;

public class FlyDemo {

    public static void main(String[] args){

        FlyConcrete f1 = new FlyConcrete();
        Flyable f2 = new FlyConcrete();

        f1.implementedmethod();
        // f1.ownMethod();

        f2.implementedmethod();
        // ((FlyConcrete)f2).ownMethod();
    }
}

// All variables & methods in Interface are by default public static final,
// we can't have instance level(non-static) variable/methods in an interface