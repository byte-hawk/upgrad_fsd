public class Loops {

    static int k= 10;

    public static void main(String[] args){

         /*
        do{
              System.out.println(" i = "+ i);
              i++;
        }while(i<5);

        */


        /*
        while(i<5){
           System.out.println(" i = "+ i);
           i++;
        }
        */

        /*
        for(int j=0; j< 10; j++){
            System.out.println(" j = "+ j);
        }

        {
            int j = 10;
            System.out.println(" j = "+ j);
            j++;
        }
        //Xmas Tree
        int level = 10;

        for(int j=1; j < level; j++){

            for(int l= 0; l < level-j ;l++){
                System.out.print(" ");
            }

            System.out.print("/");

            for(int k = 0; k < (2 * j -1); k++){
                System.out.print("*");
            }

            System.out.print("\\");
            System.out.println();
        }*/

        /*
        int num = 10;
        for(int i=0; i<=num; i++){

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<= num; k++){
                System.out.print("* ");
            }
            System.out.println();

        }*/

        for(int l= 0; l < 3 ;l++){
            for(int k= 0; k < 3 ;k++) {
                if (k == 1) {
                    continue;
                }
                System.out.print(k);
            }
            System.out.println("|");
        }

  }
}

/*

21
19
17
...
1

1. How many lines?
2. Reduction of * s -> 2
3. Increase of spacesn-> 1

*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
*/




