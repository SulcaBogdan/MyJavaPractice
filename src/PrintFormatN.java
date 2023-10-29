import java.util.Scanner;

public class PrintFormatN {
    public static void main(String[] args) {

        int n ;
        char s1, s2, s3;
        Scanner in = new Scanner(System.in);
        System.out.println("Input num: ");
        n = in.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
    }
}
