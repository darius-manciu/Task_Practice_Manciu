package brainrottingham.phone;

import brainrottingham.features.AFeature;
import brainrottingham.interfaces.IPhoneBuilder;

import java.util.ArrayList;
import java.util.List;

public class PhoneBuilder implements IPhoneBuilder {
    private String identifier;
    private String version;
    private List<AFeature> features;

    public PhoneBuilder(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
        this.features = new ArrayList<>();
    }

    public PhoneBuilder addFeature(AFeature feature) {
        features.add(feature);
        return this;
    }

    @Override
    public Phone build() {
        return new Phone(identifier, version, features);
    }
}