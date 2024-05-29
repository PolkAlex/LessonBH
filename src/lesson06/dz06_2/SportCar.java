package lesson06.dz06_2;

import lesson06.dz06_2.car.Car;

public class SportCar extends Car {

    private int maxSpeed;

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
