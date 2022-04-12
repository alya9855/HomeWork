package HW7.two;

public class Manager extends Employee{
    int subordinates;

    public Manager(String name, int age, char gender, double daySalary,int subordinates) {
        super(name, age, gender, daySalary);
        this.subordinates = subordinates;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public double getDaySalary() {
        return super.getDaySalary();
    }

    @Override
    public void setDaySalary(double daySalary) {
        super.setDaySalary(daySalary);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double getFullSalary = getDaySalary() * monthArray.length * (1 + subordinates * 1/100) ;
        return getFullSalary;
    }
}
