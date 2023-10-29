package Arrays;

public class ArrayCommonElements {
    public static void main(String[] args) {

        String[] words1 = {"Salut", "Dodan", "Marian", "Bogdan"};
        String[] words2 = {"Te", "Dodan", "Marian", "maglan"};

        for (int i = 0; i < words1.length; i++) {
            for (int j = 0; j <words2.length ; j++) {
                if (words1[i].equals(words2[j])){
                    System.out.println("Common words: " + words2[j]);
                }
            }
        }
    }
}
