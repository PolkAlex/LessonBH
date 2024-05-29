package lesson06.homeWork06_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product ball = new Product("ball", 85.69, 4.9);
        Product shirt = new Product("t-shirt", 16.99, 4.5);
        Product[] sportProducts = new Product[]{ball, shirt};

        Product apple = new Product("apple", 1.99, 4.7);
        Product mellon = new Product("mellon", 2.29, 4.6);
        Product[] fruitsProducts = new Product[]{apple, mellon};

        Category sport = new Category("Sport", sportProducts);
        Category fruit = new Category("Fruits", fruitsProducts);

        Basket basketOne = new Basket(sportProducts);
        Basket basketTwo = new Basket(fruitsProducts);

        User vadim = new User("vadim@mail.ru", "pass", basketOne);
        User sasha = new User("sasha@mail.ru", "pass01", basketTwo);

        System.out.println(sport);
        System.out.println(fruit);

        User[] users = new User[] {vadim, sasha};

        for (User user: users) {
            System.out.println(user.getUserBasket());
        }
    }
}
