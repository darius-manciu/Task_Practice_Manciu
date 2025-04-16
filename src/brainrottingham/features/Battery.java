package brainrottingham.features;

public class Battery extends AFeature {
    private int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getFeatureInfo() {
        return "Battery with " + capacity + " mAh capacity";
    }
}