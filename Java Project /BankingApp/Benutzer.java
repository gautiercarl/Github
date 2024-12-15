package BankingApp;
// class user( name, passwort, kennnumer, listkonten, list name passwort, boolean connnected ) methode account erstellen anmelden abmelden

import java.util.*;

public class Benutzer {

    private String name;
    private String passwort;
    private ArrayList<Bankkonto> listkonten = new ArrayList<>();
    private boolean isConnected;

    Scanner scanner = new Scanner(System.in);

    public Benutzer(String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
    }

    public ArrayList<Bankkonto> getListkonten() {
        return listkonten;
    }

    public String getName() {
        return name;
    }

    public boolean getStatut() {
        return isConnected;
    }

    public boolean login(String name, String passwort) {
        if (name.equals(this.name) && passwort.equals(this.passwort)) {
            isConnected = true;
            return true;
        }
        return false;
    }

    public void meineKonten(Bank bank) {
        boolean running = true;
        int choice = 0;
        int exit=0;
        Scanner scanner = new Scanner(System.in);
        if (listkonten.isEmpty()) {
            System.out.println("Sie haben noch kein Bankkonto");

        } else {
            while (running) {
           

            System.out.println("Meine Konten");
       
        System.out.println("------------------------------------------");

        for (int i = 0; i < listkonten.size(); i++) {
            Bankkonto bankkonto = listkonten.get(i);
            if (bankkonto instanceof Kontoinfo) {
                Kontoinfo konto = (Kontoinfo) bankkonto;
                System.out.println((i + 1) + "-" + konto.getKontoname());

            }
         
              exit=i;
        }
        exit+=2;
        System.out.println(exit + "- Zurück" );
        System.out.print("Wählen Sie eine Option: ");
       
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice==exit){
                    running=false;
                    break;
                }
                if(choice>listkonten.size()){
                    System.out.println("Ungültiger Wahlt. Versuchen Sie es erneut");

                    break;
                }
                Bankkonto bankkonto= listkonten.get(choice-1);
                bankkonto.kontoMenu(bank);
            }
            catch (InputMismatchException e) {
                System.out.println("Ungültige Nummer. Bitte geben Sie eine Nummer ein.");
                scanner.nextLine();
                continue;
            }


            
        }


    }
}
}


       

       
          
            

            

          