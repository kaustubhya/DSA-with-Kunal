package Bit_Manipulation;

public class Power_a_raised_to_b {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int answer = 1;

        while(power > 0){
            if((power & 1) == 1){
//                last digit
                answer *= base;
            }
            base *= base;
            power = power >> 1;
//            used in AND operation
        }
        System.out.println(answer);
    }
}
