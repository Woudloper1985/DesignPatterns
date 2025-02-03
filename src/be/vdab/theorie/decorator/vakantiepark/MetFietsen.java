package be.vdab.theorie.decorator.vakantiepark;

public class MetFietsen extends ArrangementDecorator {
    public MetFietsen(Arrangement gedecoreerdeBungalow) {
        super(gedecoreerdeBungalow);
    }

    @Override
    public String getTaken() {
        return gedecoreerdeBungalow.getTaken()
                + ", plaats fietsen bij de bungalow";
    }
}
