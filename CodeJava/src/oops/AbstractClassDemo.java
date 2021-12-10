package oops;

public abstract class AbstractClassDemo {

    int i = 0;

    public AbstractClassDemo(int i){
        this.i = i;
    }

    public void printValue(){
        System.out.println("Value of i : "+ i);
    }

    public abstract void sayHello();

    public final void finalMethod(){
        System.out.println("parent final");
    }

}
