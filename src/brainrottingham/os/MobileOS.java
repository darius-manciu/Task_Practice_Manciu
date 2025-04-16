package brainrottingham.os;

public class MobileOS implements Cloneable {
    private String version;

    public MobileOS(String version) {
        try {
            System.out.println("Initializing MobileOS version " + version);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void run() {
        System.out.println("MobileOS version " + version + " is running.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Cloning MobileOS version " + version);
        return new MobileOS(this.version);
    }
}