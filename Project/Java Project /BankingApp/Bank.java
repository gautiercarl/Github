package BankingApp;

import java.util.*;

public class Bank {
    // Eine HashMap zur Speicherung von Bankkonten, wobei die Kontonummer der
    // Schlüssel ist
    HashMap<String, Bankkonto> konten;
    // Ein Zähler, um einzigartige Kontonummern zu generieren, beginnend bei 1000
    private int kontonummerZaehler = 1000;
    private HashMap<String, Benutzer> BenutzerDatenbank;

    public Bank() {
        konten = new HashMap<>();
        BenutzerDatenbank = new HashMap<>();

    }

    public HashMap<String, Benutzer> getBenutzerDatenbank() {
        return BenutzerDatenbank;

    }

    public void neuesKontoErstellen(String name) {
        boolean running = true;
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Welche Art von Konto wollen Sie eröffnen?");
            System.out.println("------------------------------------------");

            System.out.println("1- Giro Konto");
            System.out.println("2- Sparrkonto");
            System.out.println("3- Zurück");
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
                    Benutzer benutzer = BenutzerDatenbank.get(name);
                    boolean kontoExist=false;
                    for (Bankkonto konto : benutzer.getListkonten()) {
                        if (konto instanceof Girokonto) {
                            System.out.println("Sie haben schon ein Girokonto");
                            kontoExist = true;
                            break;
                        }
                    }
                    if (benutzer != null && !kontoExist) {

                        String kontonummer = generateKontonummer();

                        Bankkonto konto = new Girokonto(benutzer.getName(), kontonummer, 100);
                        konten.put(kontonummer, konto);
                        ArrayList<Bankkonto> listkonten = benutzer.getListkonten();
                        listkonten.add(konto); // wird auch in arrayList der benutzer transportiert

                        System.out.println("Neues Konto für " + benutzer.getName() + " wurde erstellt.");
                      
                        System.out.println("Ihre Kontonummer: " + kontonummer);
                        System.out.println("------------------------------------------");
                        running=false;
                    }

                    break;
                case 2:
                 benutzer = BenutzerDatenbank.get(name);
                 kontoExist=false;
                for (Bankkonto konto : benutzer.getListkonten()) {
                    if (konto instanceof Sparrkonto) {
                        System.out.println("Sie haben schon ein Sparrkonto");
                        kontoExist = true;
                        break;
                    }
                }
                if (benutzer != null && !kontoExist) {

                    String kontonummer = generateKontonummer();

                    Bankkonto konto = new Sparrkonto(benutzer.getName(), kontonummer, 100);
                    konten.put(kontonummer, konto);
                    ArrayList<Bankkonto> listkonten = benutzer.getListkonten();
                    listkonten.add(konto); // wird auch in arrayList der benutzer transportiert

                    System.out.println("Neues Konto für " + benutzer.getName() + " wurde erstellt.");
                    System.out.println("Ihre Kontonummer: " + kontonummer);
                    System.out.println("------------------------------------------");
                    running=false;

                }

                    break;

                case 3:
                    System.out.println("");
                    running = false;
                    break;

                default:
                    System.out.println("Ungültiger Wahlt. Versuchen Sie es erneut");
                    break;
            }
        }

    }

    // Methode, um ein Konto anhand der Kontonummer abzurufen
    public Bankkonto getKonto(String kontonummer) {
        return konten.get(kontonummer);
    }

    public String generateKontonummer() {
        kontonummerZaehler++;
        // Gibt die Kontonummer im Format "DExxxx" zurück, wobei xxxx die Nummer ist
        return String.format("DE%04d", kontonummerZaehler);

    }

    public void  Überweisen(String kontonummerSender,String kontonummerEmpfänger,double betrag){
        Bankkonto senderKonto= getKonto(kontonummerSender);
        
        Bankkonto empfängerKonto= getKonto(kontonummerEmpfänger);
        if (empfängerKonto== null) {
            System.out.println("Ungültiger Kontonummer!");

        }
        else if (empfängerKonto!= null && senderKonto.kontostand>betrag) {
            senderKonto.kontostand-=betrag;
            empfängerKonto.kontostand+=betrag;
            System.out.println(betrag+ "EUR Wurde erfolgreich überwiesen");

        } else{
            System.out.println("Unzureichender Kontostand oder Ungültiger Betrag");

        }
       

        
       


    }
    public void bankmenu(boolean running, String name) {
        int choice = 0;
        Benutzer benutzer = BenutzerDatenbank.get(name);
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("Willkommen " + benutzer.getName() + " was wollen Sie jetzt tun?");
            System.out.println("------------------------------------------");

            System.out.println("1- konto erstellen");
            System.out.println("2- konto führen");
            System.out.println("3- Abmelden");

            System.out.println("Wählen Sie bitte eine Option: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Ungültiger nummer. Bitte geben Sie ein nummer ein.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    neuesKontoErstellen(name);
                    break;
                case 2:
                benutzer.meineKonten(this);
                    // System.out.println("Geben Sie bitte ihrer Kontonummer ein: ");
                    // String kontonummer = scanner.nextLine();
                    // try {
                    //     Bankkonto konto = getKonto(kontonummer);
                    //     konto.kontoMenu();

                    // } catch (Exception e) {
                    //     System.out.println("Kontonummer ungültig");
                    // }
                    break;

                case 3:
                    System.out.println(" End of the programm");
                    running = false;
                    break;

                default:
                    System.out.println("Ungültiger Wahlt. Versuchen Sie es erneut");
                    break;
            }
        }
    }

}
