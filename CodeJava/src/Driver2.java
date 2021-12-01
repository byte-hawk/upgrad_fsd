import oops.Mammals;

public class Driver2 {
    public static  void  main(String[] args) throws InterruptedException {
        Mammals m = new Mammals(1.6f, 57);
        m.height = 5;

        System.out.println(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis());
    }
}
