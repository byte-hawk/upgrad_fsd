package oops;

public class ConcreteClass extends AbstractClassDemo{

    public ConcreteClass(int i) {
        super(i);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

    public void extra(){
        System.out.println("Doing extra");
    }

}
