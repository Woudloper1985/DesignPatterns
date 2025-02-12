package be.vdab.theorie.composite.leger;

public class Soldaat implements Strijdbaar {
    private final String voornaam;

    public Soldaat(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\tSoldaat " + voornaam + " trekt ten strijde.");
    }
}
