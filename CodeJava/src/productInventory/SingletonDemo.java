package productInventory;

public class SingletonDemo {

    public static  void main(String[] args){
        /*
        Product p1 = Product.getInstance();
        Product p2 = Product.getInstance();

        // Product p1 = new Product();
        // Product p2 = new Product();

        p1.name = "Sample";

        System.out.println(p1);
        System.out.println(p2);


        final int i;
        int j = 6;

        j = 8;
        i = 10;
        */

        // i=11;

        // Singleton using Enum

        ProductEnum p1 = ProductEnum.INSTANCE;
        ProductEnum p2 = ProductEnum.INSTANCE;

        p1.setId(2);
        System.out.println(p1 == p2);
    }
}
