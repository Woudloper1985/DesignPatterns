package be.vdab.theorie.facade.lening;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;

    void storten(BigDecimal bedrag) {
        saldo = saldo.add(bedrag);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
