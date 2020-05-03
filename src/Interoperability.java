import bean.Guru;
import bean.UserObject;

public class Interoperability {
    private static Guru guru;

    int x, y;
    UserObject userObject = new UserObject();

    public static void main(String[] obj) {
        guru = new Guru("Rajeevan");
        guru.getUserDetails();
        //System.out.println(guru.getUserDetails());
        //BasicsKt.print(guru.getUserDetails());
        //Interoperability interoperability = new Interoperability();
        //interoperability.Input(32, 4.67, 353, 23.3);

        //BasicsKt.printer(7,23.2,"Test",2);
        //Checker chk = new Checker();
        //System.out.println(chk.isOdd(2));
        //BasicsKt.exposeOutput("God", 8);
        String x = "Java $Pattern Tester";
        String k = x.replace("$Pattern", "Process");
        System.out.println(k);
    }

    void Tester(Guru guru) {
        BasicsKt.print1(guru.getUserDetails());
    }

    Guru goGuru() {
        return new Guru("Rajeevan", 1988);
    }

    void setUserObject() {
        userObject.setName("Ravi");
        userObject.setUserId(123);
    }

    UserObject getUserObject() {
        return userObject;
    }

    public void Input(Object... test) {
        for (Object o : test) {
            if (o instanceof Double) {
                System.out.println(o);
            }
        }
    }

    UserData userData = new UserData(1,"Ragavan",12.0);
    UserData user = new UserData(2,"Regina");
}
