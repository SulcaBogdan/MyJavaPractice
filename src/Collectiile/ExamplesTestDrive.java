package Collectiile;


import java.util.ArrayList;
import java.util.List;

public class ExamplesTestDrive {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(4);
        listaNumere.add(6);
        listaNumere.add(11);
        listaNumere.add(5);
        listaNumere.add(11);


        ArrayListLearning arrayListLearning = new ArrayListLearning();
        System.out.println(arrayListLearning.listSum(listaNumere));
        System.out.println(arrayListLearning.listBiggestNum(listaNumere));
        System.out.println(arrayListLearning.listSmallestNum(listaNumere));
        System.out.println(arrayListLearning.sortList(listaNumere));
        System.out.println(arrayListLearning.listWithoutDuplicates(listaNumere));
        System.out.println(arrayListLearning.addSumElement(listaNumere,22));



        ArrayList<String> listaCuvinte = new ArrayList<>();
        listaCuvinte.add("Dodan");
        listaCuvinte.add("Marius");
        listaCuvinte.add("Andi");
        listaCuvinte.add("Andrei");

        System.out.println(arrayListLearning.reverseAllStrings(listaCuvinte));
    }
}
