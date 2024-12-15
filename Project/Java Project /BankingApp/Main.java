package BankingApp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       
         Bank bank = new Bank();
        HashMap<String, Benutzer> BenutzerDatenbank= bank.getBenutzerDatenbank();
        Benutzer me= new Benutzer("carl", "carl");
        BenutzerDatenbank.put("carl", me);
        Scanner scanner = new Scanner(System.in);
        
        // Anmeldungsmenu

        boolean running = true;
        int choice = 0;

        while (running) {
            System.out.println("Willkommen bei der java Bank ");
            System.out.println("------------------------------------------");

            System.out.println("1-Anmelden");
            System.out.println("2-Konto erstellen");
            System.out.println("3- Programm beenden");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Geben Sie bitte ihren Namen ein : ");
                    String name = scanner.nextLine();
                    System.out.println("Geben sie nun Ihr Passwort ein : ");
                    String passwort = scanner.nextLine();
                    Benutzer benutzer = BenutzerDatenbank.get(name);
                    if (benutzer != null && benutzer.login(name, passwort)) {
                        System.out.println("Login erfolgreich!");
                        bank.bankmenu(benutzer.getStatut(),name);
                    } else {
                        System.out.println("Login fehlgeschlagen.");
                    }
                    break;

                case 2:
                    System.out.println("Geben Sie bitte ihren Namen ein : ");
                    String newName = scanner.nextLine();
                    System.out.println("Erstellen sie nun ein passwort: ");
                    String newPasswort = scanner.nextLine();
                   
                     if(BenutzerDatenbank.get(newName)==null){
                        Benutzer newUser = new Benutzer(newName, newPasswort);
                        BenutzerDatenbank.put(newName, newUser);
                        System.out.println("Konto erfolgreich erstellt!");
                        boolean isConnected=newUser.getStatut();
                        isConnected=true;
                        bank.bankmenu(isConnected,newName);
                     }
                     else{
                        System.out.println("Ein Konto ist bereits mit diesem Namen verknüpft");
                     }
                    
                    break;
                case 3:
                    System.out.println(" End of the programm");
                    running = false;
                    break;

                default:

                    break;
            }
        }

    }
}
