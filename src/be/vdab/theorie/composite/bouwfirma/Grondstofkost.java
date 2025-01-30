package be.vdab.theorie.composite.bouwfirma;

import java.math.BigDecimal;

public class Grondstofkost implements Kost {
    private final BigDecimal eenheidsprijs;
    private final BigDecimal hoeveelheid;

    public Grondstofkost(BigDecimal eenheidsprijs, BigDecimal hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }

    @Override
    public BigDecimal getBedrag() {
        return eenheidsprijs.multiply(hoeveelheid);
    }
}
