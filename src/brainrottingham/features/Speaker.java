package brainrottingham.features;

public class Speaker extends AFeature {
    private int wattage;

    public Speaker(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String getFeatureInfo() {
        return "Speaker with " + wattage + " watt power";
    }
}