package BankingApp;

import java.util.*;

public abstract class Bankkonto {
    private String kontoinhaber;
    protected double kontostand; // zugänglich für die Unterklassen
    private String kontonummer;

    public Bankkonto(String kontoinhaber, String kontonummer) {
        this.kontoinhaber = kontoinhaber;
        this.kontonummer = kontonummer;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println("Erfolgreich " + betrag + " eingezahlt.");
            zeigeKontostand();
        } else {
            System.out.println("Ungültiger Betrag");

        }

    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
            System.out.println("Erfolgreich " + betrag + " abgehoben.");
            zeigeKontostand();
        }

        else {
            System.out.println("Unzureichender Kontostand oder Ungültiger Betrag");

        }

    }


    public void zeigeKontostand() {
        System.out.println("Kontostand von " + kontoinhaber + ": " + kontostand);
    }
//
    public void überweisenAnEmpfänger(Bank bank, String kontonummerEmpfänger, double betrag) {
        bank.Überweisen(this.kontonummer, kontonummerEmpfänger, betrag);
    }

    // Methode, die das Menü des Kontos anzeigt und die Benutzereingaben verarbeitet
    //Dependency Injection (DI) hier wir die Instanz Bank von Außen gegeben bis in Main durch die unterschiedliche parameter in dem Pfad oder Baum Aufruf
    public void kontoMenu(Bank bank) {
        boolean running = true;
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Hallo " + getKontoinhaber() + " was wollen Sie jetzt tun?");

            System.out.println("1- Kontostand anzeigen");
            System.out.println("2- Geld einzahlen");
            System.out.println("3- Geld abheben");
            System.out.println("4- Geld überweisen");
            System.out.println("5- Zurück");

            System.out.print("Wählen Sie eine Option: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Ungültige Nummer. Bitte geben Sie eine Nummer ein.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    zeigeKontostand();
                    break;
                case 2:
                    System.out.println("Wie viel wollen Sie einzahlen?");

                    double betragEin = scanner.nextInt();
                    scanner.nextLine();
                    einzahlen(betragEin);
                    break;

                case 3:
                    System.out.println("Wie viel wollen Sie abheben?");

                    double betragAb = scanner.nextInt();
                    scanner.nextLine();
                    abheben(betragAb);
                    break;
                case 4:
                System.out.println("Geben Sie bitte die Kontonummer des Empfängers:  ");
                String kontonummerEmpfänger= scanner.nextLine();
                System.out.println("Wie viel wollen Sie Überweisen?");

                    double betrag = scanner.nextInt();
                    scanner.nextLine();
                   
                    überweisenAnEmpfänger(bank, kontonummerEmpfänger, betrag);
                break;
                case 5:
                    System.out.println("");
                    running = false;
                    break;
                default:
                    System.out.println("Ungültiger Wahlt. Versuchen Sie es erneut");
                    break;
            }
        }

    }
}
