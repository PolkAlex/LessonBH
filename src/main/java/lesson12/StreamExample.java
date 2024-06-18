package lesson12;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> strings = List.of("orange", "banana", "apple");

        Predicate<String> predicate = s -> s.length() == 6;

        // две равнозначные записи
//        Function<String, String> function = String::toUpperCase;
//        Function<String, String> function1 = s -> s.toUpperCase();

        List<String> strings1 = strings.stream()
                .filter(predicate)
                .sorted()
                .map(s -> {
                    String s1 = s.toUpperCase();
                    System.out.println(s1 + " ");
                    return s1;
                })
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(strings1);
    }
}
