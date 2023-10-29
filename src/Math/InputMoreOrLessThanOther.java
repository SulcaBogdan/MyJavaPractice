package Math;

import java.util.Scanner;

public class InputMoreOrLessThanOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second num: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third num: ");
        int num3 = scanner.nextInt();
        System.out.println(checkNums(num1,num2,num3));

    }

    public static boolean checkNums(int num1, int num2, int num3){
        if(num1 >= 20 && num1 < num2 && num1 < num3){
            return  true;
        }else {
            return false;
        }
    }


}
