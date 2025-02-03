package be.vdab.theorie.decorator;

import java.math.BigDecimal;

public class MetChocolade extends KoffieDecorator{
    public MetChocolade(Koffie gedecoreerdeKoffie) {
        super(gedecoreerdeKoffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }

    @Override
    public String getBereiding() {
        return gedecoreerdeKoffie.getBereiding()
                + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
