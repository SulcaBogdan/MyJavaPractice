package HeadJavaOOP.TheGuessingGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    void startGame(){
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();

         int guessp1 = 0;
         int guessp2 = 0;
         int guessp3 = 0;

         boolean p1isRight = false;
         boolean p2isRight = false;
         boolean p3isRight = false;

        int randomNum = (int)Math.random() * 10;
        System.out.println("I'm thinking of a number between 0 and 9 ....");


        while(true){
            System.out.println("Number to guess is " + randomNum);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed the number " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player 2 guessed the number " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player 3 guessed the number "+ guessp3);

            if (guessp1 == randomNum){
                p1isRight = true;
                System.out.println("Player 1 got it");
            }
            if (guessp2 == randomNum){
                p2isRight = true;
                System.out.println("Player 2 got it");
            }
            if (guessp3 == randomNum){
                p3isRight = true;
                System.out.println("Player 3 got it");
            }
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner");
                System.out.println("Game over!");
                break;
            }else{
                System.out.println("Players will have to try again");
            }
        }
    }
}
