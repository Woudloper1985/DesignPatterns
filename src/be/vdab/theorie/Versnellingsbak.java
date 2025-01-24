package be.vdab.theorie;

public enum Versnellingsbak {
    INSTANCE;
    private int versnelling;
    void hoger() {
        if (versnelling == 5) {
            throw new VerkeerdeVersnellingException();
        }
        versnelling++;
    }
    void lager() {
        if (versnelling == -1) { // achteruit
            throw new VerkeerdeVersnellingException();
        }
        versnelling--;
    }
}