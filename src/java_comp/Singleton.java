package java_comp;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    public String property1;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return "SingleInfo";
    }
}
