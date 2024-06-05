package other.lambda;

import java.util.function.Consumer;

public class Lambda {

    public static void main(String[] args) {

        Consumer<String> consumer = (x) -> {
            System.out.println(x);
            System.out.println(x);
        };

        consumer.accept("test lambda");
    }
}
