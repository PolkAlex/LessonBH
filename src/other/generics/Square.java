package other.generics;

public class Square<T> {

    //Square переводится как "квадрат"
    private final T lenght;

    public Square(T lenght) {
        this.lenght = lenght;
    }

    public T getLenght() {
        return lenght;
    }
}
