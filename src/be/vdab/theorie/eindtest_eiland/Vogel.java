package be.vdab.theorie.eindtest_eiland;

public class Vogel extends Inwoner {
    public Vogel(String naam) {
        super(naam);
        setBarstUitReactie(new Reactie() {
            @Override
            public void reageer(Inwoner inwoner, Vulkaan vulkaan) {
                System.out.println("Vogel " + inwoner.getNaam() + " vliegt hogerop.");
            }
        });
        setStoptReactie(new Reactie() {
            @Override
            public void reageer(Inwoner inwoner, Vulkaan vulkaan) {
                System.out.println("Vogel " + inwoner.getNaam() + " keert terug naar zijn nest.");
            }
        });
    }

    @Override
    public String getSoort() {
        return "Vogel";
    }
}