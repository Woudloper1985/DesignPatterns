package be.vdab.theorie.eindtest_eiland;

public abstract class Inwoner implements Observer {
    private final String naam;
    private final String soort;
    private final Reactie reactieBijUitbarsting;
    private final Reactie reactieBijStoppen;

    public Inwoner(String naam, String soort, Reactie reactieBijUitbarsting, Reactie reactieBijStoppen) {
        this.naam = naam;
        this.soort = soort;
        this.reactieBijUitbarsting = reactieBijUitbarsting;
        this.reactieBijStoppen = reactieBijStoppen;
    }

    public String getNaam() {
        return naam;
    }

    public String getSoort() {
        return soort;
    }

    @Override
    public void barstUit() {
        reactieBijUitbarsting.reageer();
    }

    @Override
    public void stopt() {
        reactieBijStoppen.reageer();
    }
}
