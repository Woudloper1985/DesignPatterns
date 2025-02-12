package be.vdab.theorie.decorator.kerstboom;

public abstract class KerstboomDecorator implements Kerstboom {
    protected final Kerstboom gedecoreerdeKerstboom;

    public KerstboomDecorator(Kerstboom gedecoreerdeKerstboom) {
        this.gedecoreerdeKerstboom = gedecoreerdeKerstboom;
    }
}
