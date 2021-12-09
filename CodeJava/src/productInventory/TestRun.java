package productInventory;

import java.util.Timer;
import java.util.TimerTask;

public class TestRun {

    public static void main(String[] args) throws InterruptedException {
        Product p1 = new Product(1, 5.6, "Product1");
        p1.seller = new Seller("Sample 1");
        Product p2 = new Product(p1);
        p1.seller = new Seller("Sample 2");

        System.out.println(p2.seller.name);

        /*Product p1 = new Product(1, 5.6, "Product1");
        Product p2 = new Product(2, 10.3, "Product2");

        p1.setCounter(5);
        System.out.println(p1.name);
        System.out.println(p2.name);

        Color c = Color.BLUE;
        /*System.out.println(c);

        String Tnx="one by one";

       for(int i = 0; ;i+= 1000){
            System.out.println(Tnx);
            Thread.sleep(1000 + i);
       }*/

    }
}
