package HW6;

public class Employee extends Person{
     double salary;

    Employee(String name, int age, boolean sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean isSameName(Employee employee){
        if (employee.equals(null)) {
            System.out.println("You enter null");
        }
        if(employee.equals("Alex")){
            return true;
        } else
            return false;
    }


}
