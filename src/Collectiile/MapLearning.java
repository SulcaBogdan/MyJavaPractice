package Collectiile;

import java.util.HashMap;
import java.util.Map;

public class MapLearning {

    public static void main(String[] args) {

        Map<String,Integer> myHashMap = new HashMap<String,Integer>();
        myHashMap.put("Dodan", 44);
        myHashMap.put("Marius", 33);
        myHashMap.put("Andi", 20);
        System.out.println(myHashMap);

        //metoda get() pentru a accesa o cheie si returneaza valoarea acelei chei
        System.out.println(myHashMap.get("Dodan"));
        System.out.println(myHashMap.get("Marius"));

        //metoda size() returneaza numarul cheilor din hashmap
        System.out.println(myHashMap.size());

        //metodelle containsKey() si containsValue() verifica daca cheia sau valoare scrisa se afla in hashmap
        myHashMap.containsKey("Dodan");
        myHashMap.containsValue(44);


        //metoda care returneaza toate valorile din hashmap intr o lista
        System.out.println(myHashMap.values());





    }
}
