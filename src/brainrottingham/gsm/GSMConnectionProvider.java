package brainrottingham.gsm;

import brainrottingham.enums.ConnectionType;
import brainrottingham.interfaces.IGSMInterface;

public class GSMConnectionProvider {
    public static IGSMInterface getConnection(ConnectionType type) {
        switch(type) {
            case URGENT:
                return GSMUrgentConnection.getInstance();
            case PRIORITIZED:
                return GSMPrioritizedConnection.getInstance();
            case NORMAL:
                return GSMNormalConnection.getInstance();
            default:
                throw new UnsupportedOperationException("Unsupported connection type");
        }
    }
}