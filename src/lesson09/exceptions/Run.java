package lesson09.exceptions;

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
}
