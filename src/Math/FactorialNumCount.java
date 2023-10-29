package Math;

import java.util.Scanner;

public class FactorialNumCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        System.out.println(result(num));
    }

    public static int result(int num){
        int ctr = 0;
        for (int i = 1; i <=(int)Math.sqrt(num); i++) {
            if (num % i == 0 && i*i != num){
                ctr+=2;
            }else if (i*i==num){
                ctr++;
            }
        }
        return ctr;
    }

}
