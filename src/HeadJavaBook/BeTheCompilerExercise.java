package HeadJavaBook;

public class BeTheCompilerExercise {

    public static void main(String[] args) {

        //ex 1
        int x = 5;
        while ( x > 1 ) {

            if ( x < 3) {
                System.out.println("small x");
            }
            x = x - 1;
        }

        //ex 2
        int x1 = 1;
        while ( x1 < 10 ) {
            x1 = x1 - 1;
            if ( x1 > 3) {
                System.out.println("big x");
            }
        }

        //ex 3
        int x3 = 5;
        while ( x3 > 1 ) {
            x3 = x - 1;
            if ( x3 < 3) {
                System.out.println("small x");
            }
        }


    }
}



