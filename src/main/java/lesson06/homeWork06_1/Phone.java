package lesson06.homeWork06_1;

import java.io.Serializable;
import java.util.Arrays;

public class Phone implements Serializable {

    private int number;
    private String model;
    private double weight;

    public Phone (int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone: " + "number = " + number + ", model=" + model + ", weight=" + weight;
    }

    public void receiveCall (String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall (String name, int number) {
        System.out.println("Звонит: " + name + ", номер: " + number);
    }

    public int getNumber (int number) {
        return this.number;
    }

    public void sendMessage (int... numbers) {
        System.out.println("Сообщение будет отправлено абоненту(ам): " + Arrays.toString(numbers));
    }
}
