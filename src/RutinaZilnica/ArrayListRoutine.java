package RutinaZilnica;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class ArrayListRoutine {
    //Rutina zilnica pentru a tine la cald arrays. Rezolva task-urile.

    //Ce sunt ArraysList?
    //ArrayList este un array flexibil cu o dimensiune care se poate modifica.
    // El se trage din array ul traditional cu dimensiuni fixe si are o multitudine de metoda pentru a a dauga si a sterge elemente din aceasta.
    //Mostenteste clasa Collections si implementeaza interfata List<T>. Aceasta se foloseste impreuna cu generics pentru a controla tipul elementelor care vor fi adaugate in array.
    //Daca acestea nu erau folosite toate ArrayList ar fi fost arrays de Objects.
    //De ce sunt bune ArraysList?
    //Flexibilitate , viteza de redare si simplitate.

    public static void main(String[] args) {

        //TASK 1 - creeaza un array cu generic de un data type ales.
        ArrayList<Integer> arrayList = new ArrayList<>();

        //TASK 2 - adauga elemente in array de acel data type.
        arrayList.add(4);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(55);
        arrayList.add(33);
        arrayList.add(44);
        arrayList.add(22);
        arrayList.add(15);
        arrayList.add(55);

        //TASK 3 - sterge un element din array.
        arrayList.remove(3);

        //TASK 4 - inlocuieste un element din array cu o alta valoare.
        arrayList.set(1, 11);

        //TASK 5 - metoda pentru sum al elementelor
        System.out.println(ArrayListRoutine.elementSum(arrayList));

        //TASK 6 - metoda pentru sortarea elementelor crescator
        System.out.println(ArrayListRoutine.sortListC(arrayList));

        //TASK 7 - metoda pentru sortarea elementelor descrescator
        reverseSortList(arrayList);
        System.out.println(arrayList);

        //TASK 8 - metoda pentru gasirea celui mai mare element
        System.out.println(biggestElement(arrayList));

        //TASK 9 - metoda pentru gasirea celui mai mic element
        System.out.println(smallestElement(arrayList));

        //TASK 10 - metoda pentru adunare unui numar la fiecare element din array.
        System.out.println(addToNums(arrayList, 25));

        //TASK 11 - creaza un set si adaugai elementele listei
        HashSet<Integer> set = new HashSet<>();
        set.addAll(arrayList);
        System.out.println(set);
    }

    public static int elementSum(ArrayList<Integer> lista) {
        int sum = 0;
        for (int p : lista) {
            sum += p;
        }
        return sum;
    }

    public static ArrayList<Integer> sortListC(ArrayList<Integer> lista) {
        Collections.sort(lista);//putea fi apelata direct in main
        return lista;
    }


    public static void reverseSortList(ArrayList<Integer> lista) {
        Collections.sort(lista, Collections.reverseOrder());
        //putea fi apelata direct in main
    }

    public static int biggestElement(ArrayList<Integer> lista) {
        int currectElement = lista.get(0);
        for (int i = 1; i < lista.size() - 1; i++) {
            if (lista.get(i) > currectElement) {
                currectElement = lista.get(i);
            }
        }
        return currectElement;
    }
    //TASK 9 - metoda pentru gasirea celui mai mic element
    public static int smallestElement(ArrayList<Integer> lista) {
        int currectElement = lista.get(0);
        for (int i = 1; i < lista.size() - 1; i++) {
            if (lista.get(i) < currectElement) {
                currectElement = lista.get(i);
            }
        }
        return currectElement;
    }

    public static ArrayList<Integer> addToNums(ArrayList<Integer> lista , int num){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int p : lista){
            newList.add(p+num);
        }
        return newList;
    }


}





