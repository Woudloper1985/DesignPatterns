package be.vdab.theorie.observer.brand;

public class Bewoner implements Observer{
    private final String voornaam;

    public Bewoner(String naam) {
        this.voornaam = naam;
    }

    @Override
    public void update(Brand brand) {
        System.out.println(voornaam + ": BRAND --> VLUCHT!!!");
    }
}
