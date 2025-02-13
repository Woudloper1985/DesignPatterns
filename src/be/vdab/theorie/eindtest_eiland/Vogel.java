package be.vdab.theorie.eindtest_eiland;

public class Vogel extends Inwoner implements Observer {
    public Vogel(String naam) {
        super(naam);
    }

    @Override
    public void update(Vulkaan vulkaan) {
        System.out.println("Vogel " + getNaam() + " vliegt hogerop.");
    }
}