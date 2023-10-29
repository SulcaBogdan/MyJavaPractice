package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNumDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write the num: ");
        String num = input.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char numChar = num.charAt(i);
            int numInt = Character.getNumericValue(numChar);
            sum += numInt;
        }
        System.out.println(sum);
    }
}
