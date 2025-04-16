package brainrottingham.gsm;

import brainrottingham.interfaces.IGSMInterface;

public class GSMNormalConnection implements IGSMInterface {
    private static GSMNormalConnection instance;

    private GSMNormalConnection() {
        System.out.println("GSMNormalConnection created.");
    }

    public static GSMNormalConnection getInstance() {
        if(instance == null) {
            instance = new GSMNormalConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("GSMNormalConnection connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("GSMNormalConnection disconnected.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("GSMNormalConnection sending normal message: " + message);
    }
}