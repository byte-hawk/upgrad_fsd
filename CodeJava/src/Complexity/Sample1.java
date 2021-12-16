package Complexity;

public class Sample1 {

    public static void main(String[] args){
        int n = 100;
        /*
        // Log(n) time complexity
        long startTime = System.currentTimeMillis();
        System.out.println("Started at : "+startTime);
        for(int i = 2; i < n; i*=i){
            System.out.println(i);
        }
        long time1 = System.currentTimeMillis();
        System.out.println("Time Taken : "+(time1-startTime));
        System.out.println("-------------");

        //Sqrt(n) time complexity
        for(int i = 2; i*i <= n; i++){
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Time Taken : "+(time2-time1));
*/
        System.out.println("-------------");
        System.out.println(Math.sqrt(1000));

        System.out.println("-------------");
        System.out.println(Math.log(1000));
        /*

        // O(n+n) = O(2n) = O(n)
        for(int i=1; i<=10; i++){

        }

        for(int j=1; j<=10; j++){

        }*/
    }
}
