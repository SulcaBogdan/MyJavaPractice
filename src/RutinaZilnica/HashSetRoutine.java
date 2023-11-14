package RutinaZilnica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetRoutine {
    //Rutina zilnica pentru a tine la cald hashset. Rezolva task-urile.
    //Ce sunt HashSet?
    //Raspuns: HashSet urile sunt structuri de date imutabile care tin doar elemente unice. Se aseamana cu un array.
    //De ce sunt bune HashSet?
    //Sunt bune la mentinerea unicitatii unei colectii de informatii int string etc...

    public static void main(String[] args) {
        //TASK 1 - creeaza un ArrayList cu generic de un data type ales si cu valori dublicate.
        List<Integer> arrayList  = new ArrayList<Integer>(List.of(2,3,4,2,2,1,2,3,4,5,6,7));
        //TASK 2 - creeaza un hashset  si atribuiei valorile arraylist ului pentru a scapa de dublicate.
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hashSet.add(arrayList.get(i));
        }
        System.out.println(hashSet);
        //TASK 3 - sterge un element din hashset.
        hashSet.remove(3);
        //TASK 4 - inlocuieste un element din hashset cu o alta valoare.
        //Avand in vedere ca un set este imutabil pentru a executa aceaste miscare trebuie sa iteram prin set pentru
        // a gasii valoarea pe care vrem sa o schimbam si apoi sa o inlocuim direct.

        //Vom crea o metoda pentru asta
        changeElement(hashSet,5,10);

    }

    public static void changeElement (HashSet<Integer> hashSet, int oldElement, int newElement){
        for (int i = 0; i < hashSet.size(); i++) {
            if (hashSet.contains(oldElement)){
                hashSet.remove(oldElement);
                hashSet.add(newElement);
            }

        }
        System.out.println(hashSet);
    }
}
