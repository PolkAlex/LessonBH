package lesson06.homeWork06_2.engine;

public class Engine {

    private int power;
    private String manufacturer; //производитель

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
