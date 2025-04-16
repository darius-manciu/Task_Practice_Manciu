package brainrottingham.interfaces;

public interface IGSMInterface {
    void connect();
    void disconnect();
    void sendMessage(String message);
}