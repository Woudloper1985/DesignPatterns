package be.vdab.theorie.eindtest_eiland;

public abstract class Inwoner implements Observer {
    private final String naam;
    private Reactie barstUitReactie;
    private Reactie stoptReactie;

    protected Inwoner(String naam) {
        this.naam = naam;
    }

    public void setBarstUitReactie(Reactie reactie) {
        this.barstUitReactie = reactie;
    }

    public void setStoptReactie(Reactie reactie) {
        this.stoptReactie = reactie;
    }

    public String getNaam() {
        return naam;
    }

    public abstract String getSoort();

    @Override
    public void barstUit(Vulkaan vulkaan) {
        barstUitReactie.reageer(this, vulkaan);
    }

    @Override
    public void stopt(Vulkaan vulkaan) {
        stoptReactie.reageer(this, vulkaan);
    }
}