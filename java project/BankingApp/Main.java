package BankingApp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        HashMap<String, Benutzer> BenutzerDatenbank = bank.getBenutzerDatenbank();
        //Default Benutzer erstellen
        Benutzer me = new Benutzer("carl", "carl");
        BenutzerDatenbank.put("carl", me);
        Scanner scanner = new Scanner(System.in);

        // Hauptmenü-Schleife
        boolean running = true;
        while (running) {
            showMainMenu();
            int choice = getValidMenuChoice(scanner);
            switch (choice) {
                case 1:
                    handleLogin(BenutzerDatenbank, bank, scanner);
                    break;
                case 2:
                    createNewAccount(BenutzerDatenbank, bank, scanner);
                    break;
                case 3:
                    System.out.println("Ende des Programms");
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige Wahl. Bitte versuchen Sie es erneut.");
                    break;
            }
        }
    }

    // Zeigt das Hauptmenü an
    private static void showMainMenu() {
        System.out.println("Willkommen bei der Java Bank");
        System.out.println("------------------------------------------");
        System.out.println("1 - Anmelden");
        System.out.println("2 - Konto erstellen");
        System.out.println("3 - Programm beenden");
    }

    // Liest die Benutzereingabe und stellt sicher, dass sie gültig ist
    private static int getValidMenuChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine();  // Zeilenumbruch nach der Zahl
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Bitte geben Sie eine gültige Zahl ein.");
                scanner.nextLine();  // Scanner-Buffer leeren
            }
        }
    }

    // Verarbeitet den Login-Vorgang
    private static void handleLogin(HashMap<String, Benutzer> BenutzerDatenbank, Bank bank, Scanner scanner) {
        System.out.println("Geben Sie bitte Ihren Namen ein:");
        String name = scanner.nextLine();
        System.out.println("Geben Sie nun Ihr Passwort ein:");
        String passwort = scanner.nextLine();

        Benutzer benutzer = BenutzerDatenbank.get(name);
        if (benutzer != null && benutzer.login(name, passwort)) {
            System.out.println("Login erfolgreich!");
            bank.bankmenu(benutzer.getStatut(), name);
        } else {
            System.out.println("Login fehlgeschlagen. Überprüfen Sie bitte Ihren Benutzernamen und Ihr Passwort.");
        }
    }

    // Erlaubt das Erstellen eines neuen Kontos
    private static void createNewAccount(HashMap<String, Benutzer> BenutzerDatenbank, Bank bank, Scanner scanner) {
        System.out.println("Geben Sie bitte Ihren Namen ein:");
        String newName = scanner.nextLine();
        System.out.println("Erstellen Sie nun ein Passwort:");
        String newPasswort = scanner.nextLine();

        if (BenutzerDatenbank.get(newName) == null) {
            Benutzer newUser = new Benutzer(newName, newPasswort);
            BenutzerDatenbank.put(newName, newUser);
            System.out.println("Konto erfolgreich erstellt!");
            boolean isConnected = newUser.getStatut();
            bank.bankmenu(isConnected, newName);
        } else {
            System.out.println("Ein Konto ist bereits mit diesem Namen verknüpft.");
        }
    }
}
