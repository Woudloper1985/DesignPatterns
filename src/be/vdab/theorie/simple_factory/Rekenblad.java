package be.vdab.theorie.simple_factory;

class Rekenblad extends Document {
    Rekenblad(String bestandsnaam){
        super(bestandsnaam);
    }

    @Override
    void print() {
        System.out.println("afdruk van rekenblad");
    }

    @Override
    void printPreview() {
        System.out.println("afdrukvoorbeeld van rekenblad");
    }
}
