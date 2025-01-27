package be.vdab.theorie.simple_factory;

abstract class Document {
    private final String bestandsnaam;

    protected Document(String bestandsnaam) {
        this.bestandsnaam = bestandsnaam;
    }
    abstract void print();
    abstract void printPreview();
}
