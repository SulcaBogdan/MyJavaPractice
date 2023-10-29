package HeadJavaBook;

public class BeerBottles99 {



    public static void main(String[] args) {


        int beerNum = 99;
        String word = "Bottles";

        while (beerNum > 0){
            if (beerNum == 1){
                word = "Bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
           // System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Takes one down");
            beerNum -= 1;

            if (beerNum == 0){
                System.out.println("No more bottles of beer on the wall");
                break;
            }
        }
    }
}
