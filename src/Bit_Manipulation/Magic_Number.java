package Bit_Manipulation;

public class Magic_Number {

    public static void main(String[] args) {
        int number = 4;
        int base = 5;
        int answer = 0;
        while (number > 0){
            int lastDigit = number & 1;
            number = number >> 1;
            answer += lastDigit * base;
            base = base * 5;
        }
        System.out.println(answer);
    }
}
