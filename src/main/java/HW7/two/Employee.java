package HW7.two;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private double daySalary;

    public Employee(String name, int age, char gender, double daySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }


    public double getSalary(Month[] monthArray){
        double getFullSalary = getDaySalary() * monthArray.length;
        return getFullSalary;
    }


}
