package Bit_Manipulation;

public class XORing_Array {
    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-1,14,-2,-4,-1,-3};

        System.out.println(ansXOR(arr));
    }

    private static int ansXOR(int[] arr) {
        int unique = 0;

        // using a for each loop
        for(int n: arr){
            unique ^= n;
            // it works something like this inside for each loop => 0 a b c d e -a -c -d -b
            // hence we are left with only e, hence ans = e
        }

        return unique;
    }
}
