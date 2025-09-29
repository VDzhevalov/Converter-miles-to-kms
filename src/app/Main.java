package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final double KONVERT_K = 1.609344;

    public static void main(String[] args) {
        System.out.println("App for converting miles to kilometers");
        String title = "Choose the type of conversion: \n1) Miles to Kilometers \n2) Kilometers to Miles";
        double distance;

        switch (selectConvertOptionMenu(title)) {
            case 1 -> {
                distance = inputSelectedDistance("Enter number of miles: ");
                System.out.printf("%.2f miles is: %.2f kilometers", distance, convertMilesToKilometers(distance));
            }
            case 2 -> {
                distance = inputSelectedDistance("Enter number of kilometers: ");
                System.out.printf("%.2f kilometers is: %.2f miles", distance, convertKilometersToMiles(distance));
            }
        }
        SCANNER.close();
    }

    private static byte selectConvertOptionMenu(String title){
        byte type;
        do {
            System.out.println(title);
            try {
                type = SCANNER.nextByte();
            } catch (InputMismatchException e) {
                type = 0;
                SCANNER.nextLine();
            }
            if (type < 1 || type > 2) {
                System.out.println("Invalid input, please try again");
            }
        } while (type < 1 || type > 2);
        return type;
    }

    private static double inputSelectedDistance(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static double convertMilesToKilometers(double distance) {
        return distance * KONVERT_K;
    }

    private static double convertKilometersToMiles(double distance) {
        return distance / KONVERT_K;
    }
}
