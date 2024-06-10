package lesson07;

import java.util.ArrayList;

public class Lesson07 {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person vanya = new Person();
        vanya.age = 23;
        vanya.name = "Ваня";

        Person petya = new Person();
        petya.age = 25;
        petya.name = "Петя";

        persons.add(vanya);
        persons.add(petya);

        System.out.println(persons);

        ArrayList<Person> people = new ArrayList<>();

        people.add(petya);
        people.addAll(persons);

        persons.remove(1);
        System.out.println(persons);

        System.out.println(people);
    }
}
