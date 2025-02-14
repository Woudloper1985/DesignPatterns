package be.vdab.theorie.eindtest_eiland;

public class Vogel extends InwonerDecorator {
    public Vogel(Inwoner inwoner) {
        super(inwoner);
    }

    @Override
    public void reageerOpUitbarsting() {
        System.out.println("\t" + getNaam() + " de vogel vliegt hogerop.");
        //super.reageerOpUitbarsting(); nutteloos hier, dit stukje strategy krijg ik niet aan de praat ;-)
    }

    @Override
    public void reageerOpStoppen() {
        System.out.println("\t" + getNaam() + " de vogel gaat terug lager vliegen.");
        //super.reageerOpStoppen(); nutteloos hier, dit stukje strategy krijg ik niet aan de praat ;-)
    }

    @Override
    public String getSoort() {
        return "Vogel";
    }
}
