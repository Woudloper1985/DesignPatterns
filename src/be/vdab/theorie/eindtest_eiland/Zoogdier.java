package be.vdab.theorie.eindtest_eiland;

public class Zoogdier extends Inwoner implements Observer {

    protected Zoogdier(String naam) {
        super(naam);
    }

    @Override
    public void update(Vulkaan vulkaan) {
        System.out.println("Zoogdier " + getNaam() + " schuilt in zijn/haar hol.");
    }
}