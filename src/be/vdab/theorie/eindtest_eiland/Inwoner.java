package be.vdab.theorie.eindtest_eiland;

public abstract class Inwoner implements Observer {
    private final String naam;

    protected Inwoner(String naam) {
        this.naam = naam;
    }

    protected String getNaam() {
        return naam;
    }
//TEST
}
