package Recursive;

public class SumOfOneToN {
    public static void main(String[] args) {

        System.out.println(calculateSum(5));

    }

    public static int calculateSum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + calculateSum(num - 1);
    }
}
