package oops;

public class Human extends Mammals {

    public Human(float height, float weight) {
        super(height, weight);

        haveVertebra = false;
        this.height = 5;
    }

    public void walk(){
        System.out.println("Humans can walk");
    }

    public void drive(){
        System.out.println("Humans can drive.");
    }
}

// Human isA Mammal
// Human isA Vertebrate

// Java allows single inheritance, multi-level inheritance,
// but it doesn't allow Multiple inheritance
