package be.vdab.theorie.eindtest_eiland;

public class Zoogdier extends Inwoner {
    public Zoogdier(String naam) {
        super(naam);
        setBarstUitReactie(new Reactie() {
            @Override
            public void reageer(Inwoner inwoner) {
                System.out.println("\tZoogdier " + inwoner.getNaam() + " schuilt in zijn/haar hol.");
            }
        });
        setStoptReactie(new Reactie() {
            @Override
            public void reageer(Inwoner inwoner) {
                System.out.println("\tZoogdier " + inwoner.getNaam() + " komt weer tevoorschijn.");
            }
        });
    }

    @Override
    public String getSoort() {
        return "Zoogdier";
    }
}