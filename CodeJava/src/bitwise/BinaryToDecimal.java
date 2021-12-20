package bitwise;

public class BinaryToDecimal {

    // 010 -> 2
    // 1110 ->
    public static void main(String[] args){
        //System.out.println('0');

        System.out.println("Decimal equivalent is: "+getDecimal("0110"));
    }

    public static int getDecimal(String binary){
        int num = 0, len = binary.length(), pow = 1;
        for(int i = len-1 ; i>= 0; i--){
            int digit = binary.charAt(i) - '0';
            num +=  (digit * pow);
            pow <<= 1;
        }
        return num;
    }
}

// Decimal to binary