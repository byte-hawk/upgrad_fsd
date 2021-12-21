package bitwise;

public class CountSetbits {

    public static void main(String[] args){
        System.out.println("Set bit count : "+getSetBitCount(12)); // 15 = 1111
    }

    public static int getSetBitCount(int n){
        int count = 0, pow = 1;
        for(int i = 0; i<32; i++){
            if((n & pow) > 0){
                // bit at i th position is set
                count++;
            }
            pow <<= 1;
        }
        return count;
    }
}

// Get the number of different bits of 2 numbers.
// Given A & B.how many bits are different among them
// 10000 => 16
// 01111 => 15
// 0010 -> count set bits