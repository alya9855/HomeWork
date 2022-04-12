package HW7.one;

public class Worker extends Employee {

    public Worker(double baseSalary, String name, double salary) {
        super(baseSalary, name, salary);
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }
}
