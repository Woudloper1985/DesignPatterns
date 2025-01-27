package be.vdab.theorie.builder;

class InwonerMain {
    public static void main(String[] args) {
        var builder = new Inwoner.InwonerBuilder();
        //maak een nieuwe instantie van de nested class InwonerBuilder van de class Inwoner.
        var inwoner = builder.metVoornaam("Olivier")
                .metFamilienaam("Gerard")
                .metAantalKinderen(1)
                .maakInwoner();
        System.out.println(inwoner);
    }
}