package be.vdab.theorie.facade.lening;

import java.math.BigDecimal;

public class Lening {
    private final BigDecimal bedrag;

    public Lening(BigDecimal bedrag) {
        this.bedrag = bedrag;
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }
}