package be.vdab.theorie.decorator.kerstboom;

public class MetLichtjes extends KerstboomDecorator{
    public MetLichtjes(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String getInformatie() {
        return gedecoreerdeKerstboom.getInformatie() + ", met lichtjes";
    }
}
