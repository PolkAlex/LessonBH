package lesson05;

import java.io.Serializable;

public class CarBean implements Serializable {

    private String color;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CarBean() {
        this.color = "Black";
        this.year = 20;
    }
}