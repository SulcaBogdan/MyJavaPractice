package Collectiile;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListLearning {




    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        //Metoda de add care adauga in arraylist
        lista.add("Salut");
        lista.add("Parfum");
        lista.add("Adrian");
        lista.add("Calin");
        lista.add("Marius");

        //Metoda de add overloaded care adauga in arraylist pe un index specificat
        lista.add(3, "Am inserat pe index 3");

        //metoda de remove a unui elem din lista dupa index
        lista.remove(3);
        //metoda de remove a unui elem din lista dupa denumire
        lista.remove("Adrian");

        //metoda de verificare daca exista elementul din parametru in lista returneaza true sau false (boolean)
        System.out.println(lista.contains("Adrian"));

        //metoda care returneaza indexul elementului specificat
        System.out.println(lista.indexOf("Salut"));

        //metoda care returneaza numarul elementelor din lista ca length()
        System.out.println(lista.size());

        //metoda care seteaza un element din un index ales in valoarea aleasa
        lista.set(3, "Bonjour");

        //metoda care verifica daca lista este goala returneaza true sau false.
        System.out.println(lista.isEmpty());

        System.out.println(lista);
        //Metoda sort(List<E> list) care accepta ca parametru o lista iar arraylist care implementeaza List<T> IS-A list.
        Collections.sort(lista);
        System.out.println(lista);


    }


    //metoda care returneaza sum
    public int listSum(ArrayList<Integer> list){
        int sum = 0;
        for(int p : list){
            sum += p;
        }
        return sum;
    }

    //metoda care returneaza cel mai mare numar din lista
    public int listBiggestNum(ArrayList<Integer> list){

        if (list.isEmpty()){
            throw new IllegalArgumentException("list is empty");
        }

        int biggestNum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int currentNum = list.get(i);
            if (currentNum > biggestNum){
                biggestNum = currentNum;
            }
        }
        return biggestNum;
    }


    //metoda care returneaza cel mai mic numar din lista
    public int listSmallestNum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        int smallestNum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int currentNum = list.get(i);
            if (smallestNum > currentNum) {
                smallestNum = currentNum;
            }
        }
        return smallestNum;
    }




    //metoda care returneaza o lista sortata
    public ArrayList<Integer> sortList(ArrayList<Integer> list){
        //Folosim metoda sort din clasa Collections.
        Collections.sort(list);
        return list;
    }
    //metoda care returneaza o lista fara dublicate
    public HashSet<Integer> listWithoutDuplicates(ArrayList<Integer> list){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);
        return hashSet;
    }

    //metoda care aduna fiecarui element o valoare int
    public ArrayList<Integer> addSumElement(ArrayList<Integer> list, int element){
        for (int i = 0; i < list.size(); i++) {
            int newValue = list.get(i) + element;
            list.set(i, newValue);
        }
        return list;
    }


    //metoda care returneaza inversul ficarui string dintr o lista
    public ArrayList<String> reverseAllStrings(ArrayList<String> list){
        int index = 0;
        for (String stringElement : list){
            StringBuilder reversedString = new StringBuilder();
            for (int i = stringElement.length()-1; i >= 0 ; i--) {
                reversedString.append(stringElement.charAt(i));
            }
            list.set(index,reversedString.toString());
            index++;
        }
        return list;

    }

}





