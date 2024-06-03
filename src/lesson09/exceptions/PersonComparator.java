package lesson09.exceptions;

import java.util.Comparator;

public class PersonComparator {

    public static void main(String[] args) {


    }

    public static Comparator<PersonException> getName(){
        return Comparator.comparing(PersonException::getName);
    }
}


