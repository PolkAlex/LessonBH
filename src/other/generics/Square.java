package other.generics;

public class Square<T> {

    private final T lenght;

    public Square(T lenght) {
        this.lenght = lenght;
    }

    public T getLenght() {
        return lenght;
    }
}
