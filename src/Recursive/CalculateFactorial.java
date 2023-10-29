package Recursive;

public class CalculateFactorial {
    public static void main(String[] args) {
    int num1 = 10;
        System.out.println(factorialNumber(5));



    }
    public static int factorialNumber(int num){
        if (num == 0){
            return 1;
        }
        return num * factorialNumber(num -1);
    }
}
