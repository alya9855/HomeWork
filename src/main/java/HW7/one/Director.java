package HW7.one;

public class Director extends  Manager{

    public Director(double baseSalary, String name, double salary, int numberOfSubordinates) {
        super(baseSalary, name, salary, numberOfSubordinates);
    }

    @Override
    public int getNumberOfSubordinates() {
        return super.getNumberOfSubordinates();
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        super.setNumberOfSubordinates(numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }
}
