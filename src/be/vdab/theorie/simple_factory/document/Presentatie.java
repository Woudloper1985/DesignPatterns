package be.vdab.theorie.simple_factory.document;

class Presentatie extends Document {
    Presentatie(String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() {
        System.out.println("afdruk van presentatie");
    }

    @Override
    void printPreview() {
        System.out.println("afdrukvoorbeeld van presentatie");
    }
}
