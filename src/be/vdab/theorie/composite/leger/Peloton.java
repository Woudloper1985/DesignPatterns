package be.vdab.theorie.composite.leger;

import java.util.ArrayList;
import java.util.List;

public class Peloton implements Strijdbaar{
    private final int nummer;
    private final List<Soldaat> soldaten = new ArrayList<>();

    public Peloton(int nummer) {
        this.nummer = nummer;
    }

    void add (Soldaat soldaat){
        soldaten.add(soldaat);
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\tPeloton " + nummer + " trekt ten strijde.");
        soldaten.forEach(Soldaat::trekTenStrijde);
    }
}
