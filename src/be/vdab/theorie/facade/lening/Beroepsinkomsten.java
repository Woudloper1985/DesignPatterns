package be.vdab.theorie.facade.lening;

import java.math.BigDecimal;

public class Beroepsinkomsten {
    private BigDecimal maandwedde;

    public Beroepsinkomsten(BigDecimal maandwedde) {
        this.maandwedde = maandwedde;
    }

    public BigDecimal getMaandwedde() {
        return maandwedde;
    }
}
