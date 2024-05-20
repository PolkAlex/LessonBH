package lesson05;

public class CarPojo {
    //POJO может не иметь геттеры и сеттеры

    private String color;
    private int year;

    public CarPojo(String color) {
        this.color = color;
    }

    public CarPojo(int year) {
        this.year = year;
    }
}