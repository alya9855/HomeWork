package HW7.one;

public class Employee {
    private double baseSalary;
    private String name;
    private double Salary;

    public Employee(double baseSalary, String name, double salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        Salary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
