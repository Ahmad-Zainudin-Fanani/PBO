package Jobsheet3.tugas;

public class encapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        //membatasi usia antara 18 dan 30
        if (newAge > 30) {
            age = 30;
        } else if (newAge < 18) {
            age = 18;
        } else {
            age = newAge;
        }
    }
}