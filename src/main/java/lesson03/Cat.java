package lesson03;

public class Cat {
    private String name;
    private int age;

    {
        this.age = 1;
    }
    public Cat () {

    }

    public Cat (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge(int i) {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
