import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
/*
        int[] a = new int[3];


        for(int i =0 ; i < a.length; i++){
            a[i] = i+1;
        }

        for(int num : a){
            System.out.print(num + " ");
        }

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int j = 0; j< len; j++){
            arr[j] = sc.nextInt();
        }

        for(int j = 0; j< len; j++){
            System.out.println(arr[j]);
        }
*/

        // int[][] a = new int[3][4];
        int[][] a = {{1, 2, 3}, {4, 5, 6}};

        for(int r=0; r < 2; r++){
            for(int c = 0; c < 3; c++){
                System.out.println(a[r][c]);
            }
        }

        char[] arr = "abc".toCharArray();
        //arr[0] => a

    }
}
