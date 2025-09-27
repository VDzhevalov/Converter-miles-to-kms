package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for converting miles to kilometers");

         String title;
         Scanner scanner;

        scanner = new Scanner(System.in);

        title = "Enter number of miles: ";
        System.out.print(title);
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.609344;
        System.out.println(miles + " miles is " + kilometers + " kilometers");

        scanner.close();

    }
}
