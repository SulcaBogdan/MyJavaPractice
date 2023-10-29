import java.util.Date;

public class DisplaySystemDate {
    public static void main(String[] args) {

        //metoda 1
        Date systemDate = new Date();
        System.out.println(systemDate);


        //metoda 2
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }
}
