package Recursive;

public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println(calculateFibonacci(10));

    }

    public static int calculateFibonacci(int num){
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }
        return calculateFibonacci(num -1) + calculateFibonacci(num -2);
    }
}
