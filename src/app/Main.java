package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for converting miles to kilometers");

         String title;
         Scanner scanner;

        scanner = new Scanner(System.in);

        title = "Choose the type of conversion: \n1) Miles to Kilometers \n2) Kilometers to Miles";
        byte type;
        double distance;
        double convertedDistance;

        do {
            System.out.println(title);
            type = scanner.nextByte();
            if (type < 1 || type > 2) {
                System.out.println("Invalid input, please try again");
            }
        } while (type < 1 || type > 2);

        switch (type) {
            case 1: {
                System.out.print("Enter number of miles: ");
                distance = scanner.nextDouble();
                convertedDistance = distance * 1.609344;
                System.out.println(distance + " miles is: " + convertedDistance + " kilometers");
                break;
            }
            case 2: {
                System.out.print( "Enter number of kilometers: ");
                distance = scanner.nextDouble();
                convertedDistance = distance / 1.609344;
                System.out.println(distance + " kilometers is: " + convertedDistance + " miles");
                break;
            }
        };
        scanner.close();
    }
}
