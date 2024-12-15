package Praktikum5;



public class BreakDemo {
    public static void main(String[] args) {
        Integer[] numbers1 = { 10, 20, 30, 40, 50, 60, 70 };
        Integer[] numbers2 = { 5, 15, 25, 35, 45 };
        Integer[] numbers3 = { 60, 70, 80, 90 };
        Integer[] numbers4 = {};

        System.err.println("Überprüfte Werte:");
        System.err.println("Kriterium: 20");

        for (int i = 0; i < numbers1.length; i++) {

            System.out.println(numbers1[i]);
        }
        for (int num : numbers1) {

            if (num > 20) {
                System.out.println("Gefundener Wert: " + num);
                break;
            }
        }
        System.err.println("Überprüfte Werte:");
        System.err.println("Kriterium: 35");

        for (int i = 0; i < numbers2.length; i++) {

            System.out.println(numbers2[i]);
        }
        for (int num : numbers2) {
            if (num == 35) {
                System.out.println("Gefundener Wert: " + num);
                break;
            }
        }
        System.err.println("Überprüfte Werte:");
        System.err.println("Kriterium: 90");

        for (int i = 0; i < numbers3.length; i++) {

            System.out.println(numbers3[i]);
        }

        for (int num : numbers3) {
            if (num < 90) {
                System.out.println("Gefundener Wert: " + num);
                break;
            }
        }
        System.err.println("Überprüfte Werte:");
        System.err.println("Kriterium: 0");

        for (int i = 0; i < numbers4.length; i++) {

            System.out.println(numbers4[i]);
        }
        for (int num : numbers4) {
            if (num > 0) {
                System.out.println("Gefundener Wert: " + num);
                break;
            } else if (numbers4.length == 0) {
                System.out.println("Array ist leer. Kein Wert überprüfbar.");

            }
        }

    }

}
