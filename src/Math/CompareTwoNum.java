package Math;

import java.util.Scanner;

public class CompareTwoNum {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write the first number to compare: ");
        int num1 = input.nextInt();
        System.out.println("Write the second number to compare: ");
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println(num1 + " is > than "+ num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is = with "+ num2);
        }else {
            System.out.println(num1 + " is < than "+ num2);
        }

    }
}
