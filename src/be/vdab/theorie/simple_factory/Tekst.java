package be.vdab.theorie.simple_factory;

class Tekst extends Document {
    Tekst (String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() {
        System.out.println("afdruk van tekst");
    }

    @Override
    void printPreview() {
        System.out.println("afdrukvoorbeeld van tekst");
    }
}
