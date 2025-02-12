package be.vdab.theorie.composite.leger;

import java.util.ArrayList;
import java.util.List;

public class Leger implements Strijdbaar{
    private final List<Peloton> pelotons = new ArrayList<>();
    void add (Peloton peloton){
        pelotons.add(peloton);
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("Het leger trekt ten strijde.");
        pelotons.forEach(Peloton::trekTenStrijde);
    }
}
