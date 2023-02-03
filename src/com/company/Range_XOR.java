package com.company;

public class Range_XOR {
    public static void main(String[] args) {
//        range XOR for a,b = xor(b) ^ xor (a-1)
        int a = 3;
         int b = 9;

          int ans = xor(b) ^ xor (a-1);
          System.out.println(ans);


//          Checking once, but this method cannot be used for large nos because it will give us TLE ( time limit exceeded)
        int ans2 = 0;
        for(int i = a; i <=b; i++){
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    static int xor(int a){
        if (a % 4 == 0){
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
//        else
        return 0;

    }
}
