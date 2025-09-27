package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static double distance;
    private static double convertedDistance;

    public static void main(String[] args) {
        System.out.println("App for converting miles to kilometers");
        String title = "Choose the type of conversion: \n1) Miles to Kilometers \n2) Kilometers to Miles";

        byte type;

        do {
            System.out.println(title);

            try {
                type = scanner.nextByte();
            } catch (InputMismatchException e) {
                type = 0;
                scanner.nextLine();
            }
            if (type < 1 || type > 2) {
                System.out.println("Invalid input, please try again");
            }

        } while (type < 1 || type > 2);

        switch (type) {
            case 1: {
                convertMilesToKilometers();
                break;
            }
            case 2: {
                convertKilometersToMiles();
                break;
            }
        };
        scanner.close();
    }

    private static void convertMilesToKilometers() {
        System.out.print("Enter number of miles: ");
        distance = scanner.nextDouble();
        convertedDistance = distance * 1.609344;
        System.out.printf("%.2f miles is: %.2f kilometers", distance, convertedDistance);
    }

    private static void convertKilometersToMiles() {
        System.out.print( "Enter number of kilometers: ");
        distance = scanner.nextDouble();
        convertedDistance = distance / 1.609344;
        System.out.printf("%.2f kilometers is: %.2f miles", distance, convertedDistance);
    }
}
