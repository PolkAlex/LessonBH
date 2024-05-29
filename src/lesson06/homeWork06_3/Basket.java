package lesson06.homeWork06_3;

import java.util.Arrays;

public class Basket{

    //Создать класс Basket, содержащий массив купленных товаров
    private Product[] boughtProducts;

    public Basket(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public Product[] getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    @Override
    public String toString() {
        return "Basket: " + "boughtProducts = " + Arrays.toString(boughtProducts) + ";";
    }
}