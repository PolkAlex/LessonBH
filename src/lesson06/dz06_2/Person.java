package lesson06.dz06_2;

import lesson06.dz06_2.driver.Driver;

public class Person extends Driver {

    private String fullName;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
