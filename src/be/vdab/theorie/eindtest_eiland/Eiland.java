package be.vdab.theorie.eindtest_eiland;

import java.util.ArrayList;
import java.util.List;

public enum Eiland {
    INSTANCE;

    private final List<Inwoner> inwoners;
    private final Vulkaan vulkaan;

    Eiland() {
        inwoners = new ArrayList<>();
        vulkaan = new Vulkaan();
    }

    public void voegInwonerToe(Inwoner inwoner) {
        inwoners.add(inwoner);
        vulkaan.addObserver(inwoner);
    }

    //Je kan ook een remover schrijven voor inwoners, maar dat wordt niet gevraagd.

    public List<Inwoner> getInwoners() {
        return inwoners;
    }

    public Vulkaan getVulkaan() {
        return vulkaan;
    }

    //(Wordt ook niet gevraagd:)
    public void toonInwoners() {
        System.out.println("\nDe huidige inwoners: ");
        inwoners.forEach(inwoner -> System.out.println("\t" + inwoner.getSoort() + " " + inwoner.getNaam()));
    }
}
