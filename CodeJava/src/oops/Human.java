package oops;

public class Human extends Mammals {

    public Human(float height, float weight) {
        super(height, weight);

        this.height = 5;
    }

    public void walk(){
        System.out.println("Humans can walk");
    }

    public void drive(){
        System.out.println("Humans can drive.");
    }
}
