package Arrays;



public class ArrayDublicatesString {
    public static void main(String[] args) {

        String[] words = {"Salut", "Dodan", "Dodan", "Bogdan"};
        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (words[i].equals(words[j]) && (i != j)){
                    System.out.println(words[j]);
                }
            }
        }
    }
}
