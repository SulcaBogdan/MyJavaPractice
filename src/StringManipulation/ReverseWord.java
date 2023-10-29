package StringManipulation;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        for (int i = word.length()-1; i >= 0 ; i--) {
            char character  = word.charAt(i);
            System.out.print(character);
        }

    }
}
