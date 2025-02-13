package be.vdab.theorie.eindtest_eiland;

import java.util.ArrayList;
import java.util.List;

public enum Eiland {
    INSTANCE;

    private final List<Inwoner> inwoners;
    private final Vulkaan vulkaan;

    Eiland() {
        vulkaan = new Vulkaan();
        inwoners = new ArrayList<>();
    }

    public void voegInwonerToe(Inwoner inwoner) {
        inwoners.add(inwoner);
        vulkaan.addObserver(inwoner);
    }

    /*Je zou ook een remover kunnen schrijven voor inwoners
    (één per één of de lijst terug volledig leegmaken), maar dat wordt niet gevraagd.*/

    public List<Inwoner> getInwoners() {
        return inwoners;
    }

    public Vulkaan getVulkaan() {
        return vulkaan;
    }

    //Onderstaande wordt ook niet gevraagd in de opdracht:
    public void toonInwoners() {
        System.out.println("\nDe huidige inwoners van het eiland: \n");
        inwoners.forEach(inwoner -> System.out.println(inwoner.getSoort() + ' ' + inwoner.getNaam()));
    }
}
