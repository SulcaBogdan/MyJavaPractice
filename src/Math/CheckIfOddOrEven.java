package Math;

import java.util.Scanner;

public class CheckIfOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

    }
}
