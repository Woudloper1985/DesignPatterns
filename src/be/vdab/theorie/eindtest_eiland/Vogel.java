package be.vdab.theorie.eindtest_eiland;

public class Vogel extends Inwoner {
    public Vogel(String naam) {
        super(naam);
        setBarstUitReactie(new Reactie() {
            @Override
            public void reageer(Inwoner inwoner) {
                System.out.println("\tVogel " + inwoner.getNaam() + " vliegt hogerop.");
            }
        });
        setStoptReactie(new Reactie() {
            @Override
            public void reageer(Inwoner inwoner) {
                System.out.println("\tVogel " + inwoner.getNaam() + " vliegt terug lager.");
            }
        });
    }

    @Override
    public String getSoort() {
        return "Vogel";
    }
}