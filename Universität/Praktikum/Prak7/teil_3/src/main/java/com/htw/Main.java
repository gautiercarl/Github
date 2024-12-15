package com.htw;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Converter");
            System.out.println("What do you want to do?");
            System.out.println("1- Convert grad to Fahrenheit");
            System.out.println("2- Convert fahrenheit to Grad");
            System.out.println("3- Convert kilometer to meter");
            System.out.println("4- Convert meter to kilometer");
            System.out.println("5- Exit");

            System.out.println("Select a number: ");
            Scanner scanner = new Scanner(System.in);
            int choice;
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scanner.nextLine();

                continue;
            }
            float value;
            switch (choice) {
                case 1:
                    System.out.println("Please enter the value to convert: ");
                     value = scanner.nextFloat();
                    scanner.nextLine();
                    CelsiusToFahrenheitStrategy celsiusToFahrenheit = new CelsiusToFahrenheitStrategy();
                    float result = celsiusToFahrenheit.convert(value);
                    System.out.println(value + "°C to Fahrenheit: " + result + "F");
                    System.out.println("------------------------------------");

                    break;
                case 2:
                    System.out.println("Please enter the value to convert: ");
                    value = scanner.nextFloat();
                    scanner.nextLine();

                    FahrenheitToCelsiusStrategy fahrenheitToCelsius = new FahrenheitToCelsiusStrategy();
                    result = fahrenheitToCelsius.convert(value);
                    System.out.println(value + "F to celsius: " + result + "°C");
                    System.out.println("------------------------------------");

                    break;
                case 3:
                    System.out.println("Please enter the value to convert: ");
                    value = scanner.nextFloat();
                    scanner.nextLine();

                    KilometerToMileStrategy kilometerToMile = new KilometerToMileStrategy();
                    result = kilometerToMile.convert(value);
                    System.out.println(value + "Km to meter: " + result + "m");
                    System.out.println("------------------------------------");

                    break;

                case 4:
                    System.out.println("Please enter the value to convert: ");
                    value = scanner.nextFloat();
                    scanner.nextLine();

                    MileToKilometerStrategy mileToKilometer = new MileToKilometerStrategy();
                    result = mileToKilometer.convert(value);
                    System.out.println(value + "m to kilometer: " + result + "Km");
                    System.out.println("------------------------------------");

                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a correct number");
                    scanner.nextLine();

                    break;
            }
        }

    }
}