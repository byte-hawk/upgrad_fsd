import java.util.Scanner;

public class Driver {

    public static void main(String[] args){
/*
        int age = 3;
        if(age >= 60){
            System.out.println("Old");
        }
        else if(age >= 13){
            System.out.println("Young");
        }
        else{
            System.out.println("Child");
        }
*/

        String lightColor = "RED";
        switch(lightColor) {
            case "Green":
                System.out.println("Got Green!");
                break;
            case "GREEN":
            case "RED":
                System.out.println("Got GREEN OR Red!!!");
                break;
            case "YELLOW":
                System.out.println("Got YELLOW!");
                break;
            default:
                System.out.println("Didn't match!");
                break;
        }
    // Switch-case

        boolean canIMove = false;
        if(lightColor.equals("GREEN")){
            canIMove = true;
        }


        int i = 5;

        /*int result;
        if(i < 0){
            result = -i;
        }
        else{
            result = i;
        }*/

        int result = (i<0) ? -i : i;
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = sc.nextLine();

        System.out.print("Enter the price : ");
        float price = sc.nextFloat();

        System.out.print("Enter the quantity : ");
        int quantity = sc.nextInt();

        System.out.println("\n\nHere are the product details: ");

        System.out.println("Name : "+ name);
        System.out.println("Price : "+ price);
        System.out.println("Quantity : "+ quantity);
        */

        Methods.addNumbers(3,4);

        new Methods().addNumbers(5, 4);

    }

}
