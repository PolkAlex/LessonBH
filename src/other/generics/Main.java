package other.generics;

public class Main {

    public static void main(String[] args) {

        Square<Integer> square = new Square<>(5);
        System.out.println(square.getLenght());

        Square<Double> square1 = new Square<>(10.5);
        System.out.println(square1.getLenght());
    }
}
