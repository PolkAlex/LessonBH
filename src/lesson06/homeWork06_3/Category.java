package lesson06.homeWork06_3;

import java.util.Arrays;

public class Category {

    private String categoryName;
    private Product[] products;

    public String getcategoryName() {
        return categoryName;
    }

    public void setcategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Category(String categoryName, Product[] products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category: " + "categoryName = " + categoryName + ", products = " + Arrays.toString(products) + ";";
    }
}
