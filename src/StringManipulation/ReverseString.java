package StringManipulation;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or a sentance: ");
        String inputResult = input.nextLine();

        for (int i = inputResult.length()-1; i >= 0; i--) {
            char character = inputResult.charAt(i);
            System.out.print(character);
        }
    }
}
