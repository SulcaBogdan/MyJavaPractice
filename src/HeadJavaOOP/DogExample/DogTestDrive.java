package HeadJavaOOP.DogExample;

import HeadJavaOOP.DogExample.Dog;

import java.util.Arrays;

public class DogTestDrive {
    public static void main(String[] args) {

        Dog caine = new Dog();
        caine.breed = "Canine-lup";
        caine.size = 40;
        caine.name = "Betty";
        caine.bark();
        caine.dogInfo();

        Dog caine1 = new Dog();
        caine1.breed = "Pikinetz";
        caine1.size = 10;
        caine1.name = "Piky";
        caine1.bark();
        caine1.dogInfo();

        // exemplu de array de variabile de referinta a clasei dog
        // am creat un array de obiecte Dog cu dimensiune 5
        Dog[] dogArr = new Dog[5];
        // am atribuit pe indexul 0 al array ului primul obiect al clasei Dog si am initializat atributele.
        dogArr[0] = new Dog();
        dogArr[0].breed = "Leu";
        dogArr[0].name = "Dodan";
        dogArr[0].size = 44;

        dogArr[1] = new Dog();
        dogArr[2] = dogArr[0];
        System.out.println(dogArr[2].size);
        dogArr[1].bark();
    }
}
