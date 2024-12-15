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

}
