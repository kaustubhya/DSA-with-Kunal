package com.company;

public class No_of_digits_in_binary {
    public static void main(String[] args){
        int a = 34567;
        int b = 10;
        int a1 = 10;
        int b1 = 2;
//        it means 34567 in base 10 has 5 digits
//        Similarly to find no. of digits in a binary number put b = 2 and a = any number whose digits you wanna find


//        int answer = (int)(Math.log(a)/Math.log(b)) + 1;
        int answer = (int)(Math.log(a1)/Math.log(b1)) + 1;
//        time complexity = log(n)

        System.out.println(answer);
    }
}
