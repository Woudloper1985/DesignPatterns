package be.vdab.theorie.eindtest_eiland;

public class Vogel extends Inwoner {
    public Vogel(String naam) {
        super(naam, "Vogel",
                () -> System.out.println("\t" + naam + " de vogel vliegt hogerop."),
                () -> System.out.println("\t" + naam + " de vogel gaat terug lager vliegen.")
        );
    }
}
