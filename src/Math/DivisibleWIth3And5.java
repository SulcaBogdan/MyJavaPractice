package Math;

public class DivisibleWIth3And5 {
    public static void main(String[] args) {
        for (int i = 1; i < 100 ; i++) {
            if (i % 3 == 0){
                System.out.println("Divisible by 3: " + i);
            }
        }
        for (int i = 1; i < 100 ; i++) {
            if (i % 5 == 0){
                System.out.println("Divisible by 5: " + i);
            }
    }
        for (int i = 1; i < 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Divisible by 3 & 5: " + i);
            }
        }
}
}
