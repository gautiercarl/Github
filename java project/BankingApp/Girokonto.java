package BankingApp;

public class Girokonto extends Bankkonto implements Kontoinfo{
    private double ueberziehungsrahmen;
    private final String name="Girokonto";
    public Girokonto(String kontoinhaber, String kontonummer,double ueberziehungsrahmen){
        super(kontoinhaber, kontonummer);
        this.ueberziehungsrahmen=ueberziehungsrahmen;
    }

   

   @Override
   public void abheben(double betrag) {
    if (betrag > 0 && (kontostand-betrag>=ueberziehungsrahmen)) {
        kontostand -= betrag;
        System.out.println("Erfolgreich " + betrag + " abgehoben.");
        zeigeKontostand();

    }

    else {
        System.out.println("Unzureichender Kontostand oder Ungültiger Betrag");

    }

}

@Override
public String getKontoname(){
    return name;
}

}