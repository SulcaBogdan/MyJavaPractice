package StringManipulation;

import java.util.Scanner;

public class CountEverythingInString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("The string is: ");
        String inputText = input.nextLine();
        //convertim un sir de charactere intr-un array de caractere
        char[] ch = inputText.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < inputText.length(); i++) {
            if (Character.isLetter(ch[i])){
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            }else{
                other++;
            }
        }

        System.out.println("Letter:" + letter);
        System.out.println("Space:" + space);
        System.out.println("Number:" + number);
        System.out.println("Other:" + other);

    }
}

