package RutinaZilnica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapRoutine {
    //Rutina zilnica pentru a tine la cald hashmap. Rezolva task-urile.
    //Ce sunt hashmap?
    //De ce sunt bune hashmap?

    public static void main(String[] args) {
        //TASK 1 - creeaza un HashMap cu genericele specifice.
        Map<String, Integer> hashMap = new HashMap<>();
        //TASK 2 - adauga elemente KV in HashMap.
        hashMap.put("Dodan", 26);
        hashMap.put("Marius", 34);
        hashMap.put("Andi", 26);
        hashMap.put("Hilli", 25);
        //TASK 3 - sterge un element din HashMap dupa cheie.
        hashMap.remove("Hilli");
        //TASK 4 - sterge un element din HashMap dupa valoare.
        deleteByValue(hashMap, 34);
        System.out.println(hashMap);

        //TASK 5 - modifica valoarea un element din hashmap dupa cheie
        hashMap.replace("Dodan", 33);
        //TASK 7 - verifica daca exista o anumite cheie
        System.out.println(hashMap.containsKey("Dodan"));
        //TASK 8 - printeaza o valoare dupa cheie
        System.out.println(hashMap.get("Dodan"));
        //TASK 9 - Scrieți un program Java pentru a asocia valoarea specificată cu cheia specificată într-un HashMap

        //TASK 10 - Scrieți un program Java pentru a elimina toate KV de pe o HashMap.
    }
    public static void deleteByValue(Map<String,Integer> hashMap, int value){
        Iterator<Map.Entry<String,Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() == value){
                iterator.remove();
            }
        }
    }

}
