package be.vdab.theorie.composite.bouwfirma;

import java.math.BigDecimal;

public class Arbeidskost implements Kost {
    private final BigDecimal uurloon;
    private final BigDecimal aantalUren;

    public Arbeidskost(BigDecimal uurloon, BigDecimal aantalUren) {
        this.uurloon = uurloon;
        this.aantalUren = aantalUren;
    }

    @Override
    public BigDecimal getBedrag() {
        return uurloon.multiply(aantalUren);
    }
}
