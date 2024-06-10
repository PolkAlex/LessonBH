package lesson06.homeWork06_2;

import lesson06.homeWork06_2.driver.Driver;

public class Person extends Driver {

    private String fullName;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
