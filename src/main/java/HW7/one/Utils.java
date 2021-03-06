package HW7.one;

public class Utils {
    //поиск сотрудника в массиве по его имени
    public static String searchEmployeeByName(Worker [] arr){
        Worker name = null;
        for (int i = 0; i < arr.length; i++) {
            if ( name == null || name.getName().equals("Alex")) {
                name = arr[i];
            }
        }
        return name.getName();

    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени



    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double sumOfSalary(Worker [] arr){
        double salary = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSalary() != 0){
                salary += arr[i].getSalary();
            }
        }
        return salary;
    }

    //поиск наименьшей зарплаты в массиве
    public static double searchMinSalary(Worker [] arr){
        Worker salaryMin = null;
        for (int i = 0; i < arr.length; i++) {
            if (salaryMin == null || salaryMin.getSalary() > arr[i].getSalary()){
                salaryMin = arr[i];
            }
        }
        return salaryMin.getSalary();
    }

    //поиск наибольшей зарплаты в массиве
    public static double searchMaxSalary(Worker [] arr){
        Worker salaryMax = null;
        for (int i = 0; i < arr.length; i++) {
            if (salaryMax == null || salaryMax.getSalary() < arr[i].getSalary()){
                salaryMax = arr[i];
            }
        }
        return salaryMax.getSalary();
    }


    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int getMinSubordinates(Manager [] arr){
        Manager subordMin = null;
        for (int i = 0; i < arr.length; i++) {
            if (subordMin == null || subordMin.getNumberOfSubordinates() > arr[i].getNumberOfSubordinates()){
                subordMin = arr[i];
            }
        }
        return subordMin.getNumberOfSubordinates();
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int getMaxSubordinates(Manager [] arr){
        Manager subordMax = null;
        for (int i = 0; i < arr.length; i++) {
            if (subordMax == null || subordMax.getNumberOfSubordinates() < arr[i].getNumberOfSubordinates()){
                subordMax = arr[i];
            }
        }
        return subordMax.getNumberOfSubordinates();
    }



    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров



}
