package be.vdab.theorie.eindtest_eiland;

import java.util.ArrayList;
import java.util.List;

public enum Eiland {
    INSTANCE;

    private List<Inwoner> inwoners;

    Eiland() {
        inwoners = new ArrayList<>();
    }

    public void voegInwonerToe(Inwoner inwoner) {
        inwoners.add(inwoner);
    }

    public List<Inwoner> getInwoners() {
        return inwoners;
    }
}
