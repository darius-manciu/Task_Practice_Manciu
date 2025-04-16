import brainrottingham.enums.ConnectionType;
import brainrottingham.enums.FeatureType;
import brainrottingham.features.AFeature;
import brainrottingham.features.FeatureFactory;
import brainrottingham.gsm.GSMConnection;
import brainrottingham.gsm.GSMConnectionProvider;
import brainrottingham.interfaces.IGSMInterface;
import brainrottingham.interfaces.IPhoneBuilder;
import brainrottingham.os.MobileOS;
import brainrottingham.os.OSPrototypeFactory;
import brainrottingham.phone.Phone;
import brainrottingham.phone.PhoneBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Feature Factory Test -----");
        AFeature battery = FeatureFactory.createFeature(FeatureType.BATTERY);
        AFeature antenna = FeatureFactory.createFeature(FeatureType.ANTENNA);
        System.out.println(battery.getFeatureInfo());
        System.out.println(antenna.getFeatureInfo());

        System.out.println("\n----- GSM Connection Test -----");
        GSMConnection gsmConn = GSMConnection.getInstance();
        gsmConn.connect();
        gsmConn.sendMessage("Hello from shared GSM");
        gsmConn.disconnect();

        System.out.println("\n----- Multi-type GSM Connection Test -----");
        IGSMInterface urgentConn = GSMConnectionProvider.getConnection(ConnectionType.URGENT);
        urgentConn.connect();
        urgentConn.sendMessage("Emergency call!");
        urgentConn.disconnect();

        IGSMInterface prioritizedConn = GSMConnectionProvider.getConnection(ConnectionType.PRIORITIZED);
        prioritizedConn.connect();
        prioritizedConn.sendMessage("Prioritized call");
        prioritizedConn.disconnect();

        IGSMInterface normalConn = GSMConnectionProvider.getConnection(ConnectionType.NORMAL);
        normalConn.connect();
        normalConn.sendMessage("Regular call");
        normalConn.disconnect();

        System.out.println("\n----- Phone Builder Test -----");
        IPhoneBuilder builder = new PhoneBuilder("ID_12345", "v1.0");
        Phone phone = ((PhoneBuilder)builder)
                .addFeature(battery)
                .addFeature(antenna)
                .addFeature(FeatureFactory.createFeature(FeatureType.COMPASS))
                .build();
        System.out.println(phone);

        System.out.println("\n----- Mobile OS Prototype Test -----");
        try {
            MobileOS os1 = OSPrototypeFactory.getOS("v1.0");
            os1.run();
            MobileOS os2 = OSPrototypeFactory.getOS("v2.0");
            os2.run();
            MobileOS os3 = OSPrototypeFactory.getOS("v3.0");
            os3.run();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}