package be.vdab.theorie.facade.stereoketen;

class Stereoketen {
    private final Versterker versterker = new Versterker();
    private final Equalizer equalizer = new Equalizer();
    private final Radio radio = new Radio();
    private final CDSpeler cdSpeler = new CDSpeler();
    private Geluidsbron huidigeGeluidsbron;
    void start() {
        versterker.start();
        equalizer.start();
    }
    void stop() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
            /*huidigeGeluidsbron = null;
            (niet nodig voor de werking van de façade, maar in de realiteit wel logisch)*/
        }
        versterker.stop();
        equalizer.stop();
    }
    void startRadio() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        radio.start();
        huidigeGeluidsbron = radio;
    }
    void startCDSpeler() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        cdSpeler.start();
        huidigeGeluidsbron = cdSpeler;
    }
}