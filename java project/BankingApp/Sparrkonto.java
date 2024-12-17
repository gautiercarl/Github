package BankingApp;

public class Sparrkonto extends Bankkonto implements Kontoinfo{
    private double zinsen;
    private final String name="Sparrkonto";

    public Sparrkonto(String kontoinhaber, String kontonummer,double zinsen){
        super(kontoinhaber, kontonummer);
        this.zinsen=zinsen;

    }

    

          @Override
public String getKontoname(){
    return name;
}

// Methode zur Berechnung der Zinsen und Hinzufügung zum Kontostand
public void zinsenHinzufuegen() {
    double zinsenBetrag = kontostand * zinsen / 100;  // Zinsen als Prozentsatz des Kontostands
    kontostand += zinsenBetrag;
    System.out.println("Zinsen in Höhe von " + zinsenBetrag + " wurden hinzugefügt.");
    zeigeKontostand();
}

}
