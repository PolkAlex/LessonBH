package lesson06.dz06_2.car;

import lesson06.dz06_2.driver.Driver;
import lesson06.dz06_2.engine.Engine;

public abstract class Car {

    private String mark;
    private String classAuto;
    private int weight;

    Driver driver = new Driver();
    Engine engine = new Engine();

    public void start () {
        System.out.println("Поехали");
    }

    public void stop () {
        System.out.println("Останавливаемся");
    }

    public void turnRight () {
        System.out.println("Поворот направо");
    }

    public void turnLeft () {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
