package Recursive;

public class CalculateExponentiationOfNumberRaisedToAPower {

    public static int calculateExponentiation(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * calculateExponentiation(base, exponent-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateExponentiation(2,2));
    }
}
