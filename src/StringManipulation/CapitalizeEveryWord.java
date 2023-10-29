package StringManipulation;

import java.util.Scanner;

public class CapitalizeEveryWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentance here: ");
        String sentance = scanner.nextLine();
        System.out.println(capitalizeSentance(sentance));

    }
    public static String capitalizeSentance(String sentance){
        String[] words = sentance.split(" ");
        StringBuilder capitalizedText = new StringBuilder();
        for (String word : words){
            String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1);
            capitalizedText.append(capitalizedWord).append(" ");
        }
        String finalCapitalizedText = capitalizedText.toString().trim();
        return finalCapitalizedText;
    }





}
