package brainrottingham.features;

import brainrottingham.enums.FeatureType;

public class FeatureFactory {
    public static AFeature createFeature(FeatureType type) {
        switch(type) {
            case BATTERY:
                return new Battery(3000);
            case ANTENNA:
                return new Antenna("4G");
            case COMPASS:
                return new Compass();
            case SPEAKER:
                return new Speaker(10);
            default:
                throw new UnsupportedOperationException("Unsupported feature type");
        }
    }
}