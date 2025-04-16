package brainrottingham.gsm;

import brainrottingham.interfaces.IGSMInterface;

public class GSMPrioritizedConnection implements IGSMInterface {
    private static GSMPrioritizedConnection instance;

    private GSMPrioritizedConnection() {
        System.out.println("GSMPrioritizedConnection created.");
    }

    public static GSMPrioritizedConnection getInstance() {
        if(instance == null) {
            instance = new GSMPrioritizedConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("GSMPrioritizedConnection connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("GSMPrioritizedConnection disconnected.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("GSMPrioritizedConnection sending prioritized message: " + message);
    }
}