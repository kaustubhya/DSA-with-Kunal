package Bit_Manipulation;

public class power_of_two {
    public static void main(String[] args) {
        int n = 32;
//        n can be any integer here
        boolean ans = (n & (n-1)) == 0;

        if (n == 0){
            ans = false;
        }
        System.out.println(ans);
    }
}
