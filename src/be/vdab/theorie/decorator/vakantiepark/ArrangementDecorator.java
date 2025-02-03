package be.vdab.theorie.decorator.vakantiepark;

public abstract class ArrangementDecorator implements Arrangement {
    protected final Arrangement gedecoreerdeBungalow;

    ArrangementDecorator(Arrangement bungalow) {
        this.gedecoreerdeBungalow = bungalow;
    }
}
