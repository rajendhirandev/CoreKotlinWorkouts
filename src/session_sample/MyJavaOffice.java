package session_sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rajendhiran Easu
 * @date 11, October-2019
 */
public class MyJavaOffice {

    public static void main(String[] args) {
        List<Employees> da = List.of(new Employees(1, "", 1, 2.0));
        da.forEach(e -> System.out.println("i = " + e.toString()));

        ArrayList<Employees> employees = new ArrayList<>();
        employees.add(new Employees(100, "Ragavan", 23, 50000.0));
        employees.add(new Employees(101, "Aaradhana", 20, 780000.0));
        employees.add(new Employees(102, "Lara", 28, 15000.0));
        employees.add(new Employees(103, "Kavi", 33, 123000.0));

        // List of people age greater than or equal to 25

        /*for (Employees e : employees) {
            if (e.eAge >= 25) {
                System.out.println(e.toString());
            }
        }*/
        //employees.stream().filter(e -> e.geteAge() >= 25).forEach(e -> System.out.println(e.toString()));

       /* System.out.println(KtUtils.generatePasswordResetCode());
        System.out.println(KtUtils.maskEmailAddress("rajendhiran.easu@pearson.com"));
        System.out.println(Utils.generateCode());*/

      /* List<Integer> integers = new ArrayList<>();
       integers.add(12);
        integers.add(1);
        integers.add(38);
        integers.add(3);
        integers.add(5);*/

        List<Integer> integers = Arrays.asList(12, 1, 38, 3, 5);
        List<Employees> employeesList = Arrays.asList(new Employees(1, "", 42, 12.4), new Employees(1, "", 42, 12.4));
        System.out.println("employeesList.size() = " + employeesList.size());

        System.out.println(integers.stream().filter(e -> e > 10).mapToInt(e -> e).sum());

       Off of = new Off();
       of.TesterOff();

    }
}


class Employees {
    public Employees(long eId, String eName, int eAge, double eSalary) {
        var x = eName;
        this.eId = eId;
        this.eName = eName;
        this.eAge = eAge;
        this.eSalary = eSalary;
        System.out.println("x.length() = " + x.length());
    }

    long eId;
    String eName;
    int eAge;
    double eSalary;

    public long geteId() {
        return eId;
    }

    public void seteId(long eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        String empDetails = "Emp Id:" + geteId() + " Name: " + geteName() + " Age:" + geteAge() + " Sal: " + geteSalary();
        return empDetails;
    }
}