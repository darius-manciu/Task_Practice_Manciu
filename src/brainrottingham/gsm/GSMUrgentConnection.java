package brainrottingham.gsm;

import brainrottingham.interfaces.IGSMInterface;

public class GSMUrgentConnection implements IGSMInterface {
    private static GSMUrgentConnection instance;

    private GSMUrgentConnection() {
        System.out.println("GSMUrgentConnection created.");
    }

    public static GSMUrgentConnection getInstance() {
        if(instance == null) {
            instance = new GSMUrgentConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("GSMUrgentConnection connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("GSMUrgentConnection disconnected.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("GSMUrgentConnection sending urgent message: " + message);
    }
}