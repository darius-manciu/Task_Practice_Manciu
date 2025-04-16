package brainrottingham.features;

public class Antenna extends AFeature {
    private String type;

    public Antenna(String type) {
        this.type = type;
    }

    @Override
    public String getFeatureInfo() {
        return "Antenna type: " + type;
    }
}