package Collectiile;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetLearning {

    public static void main(String[] args) {
        //HashSet este un set care poate tine doar elementele unice(fara dublicate)
        HashSet<String> myHashSet = new HashSet<String>();

        myHashSet.add("Marius");
        myHashSet.add("Dodan");
        myHashSet.add("Dumnezeu");
        myHashSet.add("Dumnezeu");

        myHashSet.remove("Dumnezeu");
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains("Dumnezeu"));
        System.out.println(myHashSet);


        TreeSet<String> myTreeSet = new TreeSet<String>();
        myTreeSet.addAll(myHashSet);
        System.out.println(myTreeSet);



    }


}
