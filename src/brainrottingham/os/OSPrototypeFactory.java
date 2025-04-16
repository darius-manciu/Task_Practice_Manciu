package brainrottingham.os;

import java.util.HashMap;

public class OSPrototypeFactory {
    private static HashMap<String, MobileOS> prototypes = new HashMap<>();

    static {
        prototypes.put("v1.0", new MobileOS("v1.0"));
        prototypes.put("v2.0", new MobileOS("v2.0"));
        prototypes.put("v3.0", new MobileOS("v3.0"));
    }

    public static MobileOS getOS(String version) throws CloneNotSupportedException {
        if (prototypes.containsKey(version)) {
            return (MobileOS) prototypes.get(version).clone();
        } else {
            throw new UnsupportedOperationException("Unsupported OS version");
        }
    }
}
