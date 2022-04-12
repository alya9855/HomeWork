package HW7.one;

public class Manager extends Worker {
   private int numberOfSubordinates;

    public Manager(double baseSalary, String name, double salary, int numberOfSubordinates) {
        super(baseSalary, name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getBaseSalary();
        } else {
            return getBaseSalary() * (numberOfSubordinates / 100 * 3);
        }

    }
}
