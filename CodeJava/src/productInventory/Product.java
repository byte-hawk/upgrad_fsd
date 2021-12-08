package productInventory;

enum Color{
    RED, GREEN, BLUE
}

public class Product {
    int id;
    private double price;
    public String name;

    private static Product instance = new Product();

    static int counter = 0;
    static String name2;

    static {
        counter = 10;
        name2 = "class generated";
    }
/*
    public Product(int id){
        this.id  = id;
    }

    public Product(int id, double price){
        this.id  = id;
        this.price = price;
    }

    public Product(int id, double price, String name){
        this.id  = id;
        this.price = price;
        this.name = name;
    }

    public Product(Product p){
        this.id = p.id;
        this.name = this.getLowerCaseName(p.name);
        this.price = p.price;
    }
*/
    private Product(){}

    public static Product getInstance(){
        return instance;
    }

    public String getUpperCaseName(String name){
        return name.toUpperCase();
    }


    public static String getLowerCaseName(String name){
        return name.toLowerCase();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        Product.counter = counter;
    }
}
