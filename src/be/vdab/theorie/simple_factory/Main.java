package be.vdab.theorie.simple_factory;

class Main {
    public static void main(String[] args) {
        var document = DocumentFactory.INSTANCE.open("liedje.docx");
        document.printPreview();
        document.print();
    }
}