package be.vdab.theorie.observer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var aandeel = new Aandeel("ORCL");
        var larry = new Aandeelhouder("Larry");
        var james = new Aandeelhouder("James");
        aandeel.addObserver(larry);
        aandeel.addObserver(james);
        aandeel.addObserver(new Overheid());
        aandeel.setKoers(BigDecimal.valueOf(39));
        System.out.println();
        aandeel.removeObserver(james);
        aandeel.setKoers(BigDecimal.valueOf(40));
    }
}
