package be.vdab.theorie.façade;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var persoon = new Persoon(
                new Beroepsinkomsten(BigDecimal.valueOf(3_000)),
                new Rekening());
        //persoon.getRekening().storten(BigDecimal.valueOf(5)); --> Goedgekeurd!
        var verstrekker = new LeningVerstrekker();
        if (verstrekker.isLeningGoedgekeurd(persoon)){
            System.out.println("Goedgekeurd");
        } else {
            System.out.println("Afgekeurd");
        }
    }
}