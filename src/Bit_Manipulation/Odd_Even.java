package Bit_Manipulation;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println(isOdd(54));


    }

    public static boolean isOdd(int number){
        return (number & 1) == 1;
        // single and '&' is a bitwise operator
    }

}
