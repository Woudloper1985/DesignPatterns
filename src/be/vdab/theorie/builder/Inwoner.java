package be.vdab.theorie.builder;

class Inwoner {
    private final String voornaam;
    private final String familienaam;
    private final int aantalKinderen;

    private Inwoner(String voornaam, String familienaam, int aantalKinderen) {
        //constructor op private zetten; zo kan enkel de nested class InwonerBuilder hem aanroepen.
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
    }

    @Override
    public String toString() {
        return voornaam + ' ' + familienaam + ' ' + aantalKinderen;
    }

    static class InwonerBuilder { //static class ...Builder toevoegen
        private String voornaam;
        private String familienaam;
        private int aantalKinderen;

        InwonerBuilder metVoornaam(String voornaam) {
            this.voornaam = voornaam;
            return this;
        }

        InwonerBuilder metFamilienaam(String familienaam) {
            this.familienaam = familienaam;
            return this;
        }

        InwonerBuilder metAantalKinderen(int aantalKinderen) {
            this.aantalKinderen = aantalKinderen;
            return this;
        }

        Inwoner maakInwoner() {
            return new Inwoner(voornaam, familienaam, aantalKinderen);
        }
    }

}