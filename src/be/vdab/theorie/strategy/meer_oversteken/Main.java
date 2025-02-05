package be.vdab.theorie.strategy.meer_oversteken;

public class Main {
    public static void main(String[] args) {
        var oversteek = new Oversteek();
        oversteek.doeEenOversteek(()-> System.out.println("Schaatsen over het ijs"));
        System.out.println();
        oversteek.doeEenOversteek(()-> System.out.println("Zeilen over het meer"));
    }
}
