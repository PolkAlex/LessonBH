package lesson09.exceptions;

public class PersonException {

    private Integer age;
    private String name;

    public PersonException(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonException{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
