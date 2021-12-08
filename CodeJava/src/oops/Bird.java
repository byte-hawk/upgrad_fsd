package oops;

public class Bird extends Mammals {

    public Bird(float height, float weight) {
        super(height, weight);
    }

    public void walk(){
        System.out.println("Elephant can walk");
    }

    public void fly() {
        System.out.println("I Can Fly");
    }
}
