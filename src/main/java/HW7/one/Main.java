package HW7.one;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Worker worker1 = new Worker(20, "Sergey", 30);
        Worker worker2 = new Worker(30, "Alex", 40);
        Worker worker3 = new Worker(40, "Masha", 50);
        Worker[] array1 = {worker1, worker2, worker3};
        Manager manager1 = new Manager(20, "Sergey", 30,2);
        Manager manager2 = new Manager(10, "Alex", 20,3);
        Manager manager3 = new Manager(40, "Sasha", 70,1);
        Manager[] managers = {manager1, manager2, manager3};
        double pMin = Utils.searchMinSalary(array1);
        System.out.println(pMin);
        double allSalary = Utils.sumOfSalary(array1);
        System.out.println(allSalary);




    }









}
