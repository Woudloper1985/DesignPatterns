package be.vdab.theorie.eindtest_eiland;

public class Zoogdier extends Inwoner {
    public Zoogdier(String naam) {
        super(naam, "Zoogdier",
                () -> System.out.println("\t" + naam + " het zoogdier verstopt zich in zijn/haar hol."),
                () -> System.out.println("\t" + naam + " het zoogdier komt terug uit zijn/haar hol.")
        );
    }
}
