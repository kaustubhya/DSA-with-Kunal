package Bit_Manipulation;

public class no_of_set_bits {
    public static void main(String[] args) {
        int n = 456789425;
        System.out.println(Integer.toBinaryString(n));
//        converts an integer to binary and puts it as a representation of string
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0;

        while (n > 0){
            count++;
            n = n - (n & (-n));
        }

//        Alternative
        while (n > 0){
            n = n & (n-1);
            count++;

        }
        return count;

    }

}
