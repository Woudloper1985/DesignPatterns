package be.vdab.theorie.strategy.meer_oversteken;

public class Oversteek {
    void doeEenOversteek(Vervoermiddel vervoermiddel){
        System.out.println("Inpakken");
        vervoermiddel.vervoer();
        System.out.println("Uitpakken");
    }
}
