package be.vdab.theorie.observer.kopiemachine;

public class Technieker implements Observer {
    private final long personeelsnummer;

    public Technieker(long personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }


    @Override
    public void update(FotokopieMachine machine) {
        System.out.println("Technieker " + personeelsnummer + " noteert onderhoud voor machine " + machine.getSerieNummer());
    }
}
