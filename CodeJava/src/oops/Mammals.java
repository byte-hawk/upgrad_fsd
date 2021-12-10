package oops;

public class Mammals extends Vertebrate implements Flyable{
    public float height;
    private float weight;

    public Mammals(float height, float weight) {
        super();
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public void walk(){
        System.out.println("Mammals walks");
    }

    public void eat(String food){
        System.out.println("Mammal is eating "+food);
    }

    public void fly() {
        System.out.println("Can't Fly");
    }

}
