package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {20, 20, 30, 40, 50, 50, 50};
        int[] newArray = removeDuplicates(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int newSize = 0; // Mărimea noului array fără duplicate
        int[] newArray = new int[array.length];

        // Parcurgem array-ul initial pentru a copia elementele unice în noul array
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Verificăm dacă elementul este deja în noul array
            for (int j = 0; j < newSize; j++) {
                if (array[i] == newArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Dacă elementul nu este duplicat, îl adăugăm în noul array
            if (!isDuplicate) {
                newArray[newSize] = array[i];
                newSize++;
            }
        }

        // Redimensionăm noul array pentru a înlătura eventualele elemente neutilizate
        return Arrays.copyOf(newArray, newSize);
    }
}
