package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Python");

        list.add("Java");

        list.add("PHP");

        list.add("C#");

        list.add("C++");

        list.add("Perl");

        String[] my_array = new String[list.size()]; // am creat un array cu size cat arraylist
        list.toArray(my_array);//am convertit arraylist to array folosind comanda .toArray()
        System.out.println(Arrays.toString(my_array));
    }
}
