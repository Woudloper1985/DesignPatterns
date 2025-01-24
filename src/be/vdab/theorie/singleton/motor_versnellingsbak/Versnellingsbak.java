package be.vdab.theorie.singleton.motor_versnellingsbak;

public enum Versnellingsbak {
    INSTANCE;
    private int versnelling; //wordt op 0 geïnitialiseerd
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