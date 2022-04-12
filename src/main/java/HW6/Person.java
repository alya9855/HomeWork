package HW6;

public class Person {
    String name;
    int age;
    boolean sex; //true - girl, false -man

    Person(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public  String getName() { //null
        if (this.sex = true){
            return ("Mrs" + this.name);
        } else
        return ("Mr" + this.name);
    }

    public  void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
