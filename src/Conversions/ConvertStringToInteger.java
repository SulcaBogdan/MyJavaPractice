package Conversions;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(string): ");
        String num = sc.nextLine();
        int result = Integer.parseInt(num);
        System.out.println("The integer value is : " + result);

    }
}
