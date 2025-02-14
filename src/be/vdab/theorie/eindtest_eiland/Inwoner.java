package be.vdab.theorie.eindtest_eiland;

public abstract class Inwoner implements Observer {
    private final String naam;
    private final String soort;
    private final Reactie bijUitbarsting;
    private final Reactie bijStoppen;

    public Inwoner(String naam, String soort, Reactie bijUitbarsting, Reactie bijStoppen) {
        this.naam = naam;
        this.soort = soort;
        this.bijUitbarsting = bijUitbarsting;
        this.bijStoppen = bijStoppen;
    }

    public String getNaam() {
        return naam;
    }

    public String getSoort() {
        return soort;
    }

    public Reactie getReactieBijUitbarsting() {
        return bijUitbarsting;
    }

    public Reactie getBijStoppen() {
        return bijStoppen;
    }

    @Override
    public void reageerOpUitbarsting() {
        bijUitbarsting.reageer();
    }

    @Override
    public void reageerOpStoppen() {
        bijStoppen.reageer();
    }
}
