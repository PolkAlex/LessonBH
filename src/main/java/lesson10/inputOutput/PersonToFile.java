package lesson10.inputOutput;

import java.io.Serializable;

public class PersonToFile implements Serializable {

    private String name;
    private int age;

    public PersonToFile(String name, int age) {
        this.name = name;
        this.age = age;
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
}
