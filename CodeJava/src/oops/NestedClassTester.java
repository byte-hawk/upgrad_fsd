package oops;

public class NestedClassTester {

    public static void main(String[] args){
        NestedClasses.StaticNestedClass snc = new NestedClasses.StaticNestedClass();
        System.out.println(snc.i);
        NestedClasses ns = new NestedClasses();
        //NestedClasses.NestedClass2 ns2 = ns.new NestedClass2();
    }
}

// BusinessPartner.Address address = new BusinessPartner.Address();

// When should we go for static nested class?
// When we want to have the nested class's existence only through the wrapping class.

// Non-static nested class is called inner class. What is the use of inner class?
// When we want to use a nested class for transferring data among instance methods of the wrapping class.


// Git Assignment submission
// UML diagram assignment
