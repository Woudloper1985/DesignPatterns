package be.vdab.theorie.decorator.vakantiepark;

public class MetBarbecue extends ArrangementDecorator {
    public MetBarbecue(Arrangement gedecoreerdeBungalow) {
        super(gedecoreerdeBungalow);
    }

    @Override
    public String getTaken() {
        return gedecoreerdeBungalow.getTaken()
                + ", plaats een barbecue bij de bungalow";
    }
}
