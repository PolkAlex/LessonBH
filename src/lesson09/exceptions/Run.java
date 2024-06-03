package lesson09.exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        PersonException person = new PersonException(17, "Petr");
        bar(person);

        PersonException person1 = null;
        try {
            Integer age = person1.getAge();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        PersonException personException = new PersonException(22, "Alex");
        System.out.println(personException);
        System.out.println(person1);

        try {
            nullPointer();
            System.out.println("дальше код в блоке трай-кэч не выполняется после nullPointer()");
            runTime();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this is finally");
        }

        System.out.println("End of program");

        PersonException person2 = new PersonException(24, "Dima");
        PersonException person3 = new PersonException(21, "Alex");
        PersonException person4 = new PersonException(27, "Petr");
        PersonException person5 = new PersonException(34, "John");
        PersonException person6 = new PersonException(67, "Nikita");

        List<PersonException> persons = new ArrayList<>();
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        System.out.println(persons);

        Collections.sort(persons, PersonComparator.getName());

        System.out.println(persons);
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new ValidateAgeException(age, 18);
        }
    }

    public static void bar(PersonException person) {
        try {
            validateAge(person.getAge());
            System.out.println(person.getName() + "напивается");
        } catch (ValidateAgeException e) {
            System.out.println(person.getName() + " идет грустный домой");
        }
    }

    public static void nullPointer() {
        throw new NullPointerException("this is null");
    }

    public static void illegal() {
        throw new IllegalArgumentException("this is illegal");
    }

    public static void runTime() {
        throw new RuntimeException("this is runTime");
    }

    public static void printName(String name) {
        System.out.println(name);
    }
}
