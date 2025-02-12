package be.vdab.theorie.decorator.kerstboom;

public class MetBallen extends KerstboomDecorator{
    public MetBallen(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String getInformatie() {
        return gedecoreerdeKerstboom.getInformatie() + ", met ballen";
    }
}
