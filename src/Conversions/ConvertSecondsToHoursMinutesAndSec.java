package Conversions;

import java.util.Scanner;

public class ConvertSecondsToHoursMinutesAndSec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te amount of seconds you want: ");
        int seconds = sc.nextInt();
        int second = seconds % 60;
        int hours = seconds / 60;
        int minutes = hours % 60;
        hours = hours/60;


        System.out.println(hours + ":" + minutes + ":" + second);
    }
}
