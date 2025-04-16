package brainrottingham.gsm;

import brainrottingham.interfaces.IGSMInterface;

public class GSMConnection implements IGSMInterface {
    private static GSMConnection instance;

    private GSMConnection() {
        System.out.println("GSMConnection created.");
    }

    public static GSMConnection getInstance() {
        if(instance == null) {
            instance = new GSMConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("GSMConnection connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("GSMConnection disconnected.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("GSMConnection sending message: " + message);
    }
}