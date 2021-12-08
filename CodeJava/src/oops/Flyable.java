package oops;

public interface Flyable {

    int i = 0;

    void fly();

    // Only available from Java 8 onwards
    default void implementedmethod(){
        System.out.println("Implementation inside interface");
    }
}
