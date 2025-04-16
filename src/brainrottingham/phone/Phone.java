package brainrottingham.phone;

import brainrottingham.features.AFeature;
import java.util.Collections;
import java.util.List;

public final class Phone {
    private final String identifier;
    private final String version;
    private final List<AFeature> features;

    Phone(String identifier, String version, List<AFeature> features) {
        this.identifier = identifier;
        this.version = version;
        this.features = features != null ? Collections.unmodifiableList(features) : Collections.emptyList();
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getVersion() {
        return version;
    }

    public List<AFeature> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Phone [identifier=" + identifier + ", version=" + version + "]\n");
        if (!features.isEmpty()) {
            sb.append("Features:\n");
            for (AFeature feature : features) {
                sb.append(" - ").append(feature.getFeatureInfo()).append("\n");
            }
        }
        return sb.toString();
    }
}