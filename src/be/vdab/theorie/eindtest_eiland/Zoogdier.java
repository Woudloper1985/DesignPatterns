package be.vdab.theorie.eindtest_eiland;

public class Zoogdier extends InwonerDecorator {
    public Zoogdier(Inwoner inwoner) {
        super(inwoner);
    }

    @Override
    public void reageerOpUitbarsting() {
        System.out.println("\t" + getNaam() + " het zoogdier verstopt zich in zijn/haar hol.");
        //super.reageerOpUitbarsting();
    }

    @Override
    public void reageerOpStoppen() {
        System.out.println("\t" + getNaam() + " het zoogdier komt terug uit zijn/haar hol.");
        //super.reageerOpStoppen();
    }

    @Override
    public String getSoort() {
        return "Zoogdier";
    }
}
