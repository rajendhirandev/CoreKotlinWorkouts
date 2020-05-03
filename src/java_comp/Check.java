package java_comp;

public class Check {
    public static void main(String[] args) {
        String property1 = Singleton.getInstance().property1;
        String info = Singleton.getInstance().getInfo();
    }
}
