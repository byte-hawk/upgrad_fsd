package oops;

public class OOPSDriver {

    public static void main(String[] args){
        Mammals m = new Mammals(1.6f, 57);
        Human h = new Human(1.7f, 63);
        Elephant e = new Elephant(2.1f, 129);

        m.height = 5;
        System.out.println("Height of Mammal : "+ m.getHeight());
        System.out.println("Height of Human : "+ h.getHeight());
        System.out.println("Height of Elephant : "+ e.getHeight());

        m.walk();
        m.eat();

        h.walk();
        h.drive();
        h.eat();

        e.walk();
        e.eat();

    }
}
