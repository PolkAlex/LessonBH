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
}
