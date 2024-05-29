package lesson06.homeWork06_3;

public class User {
    //Создать класс User, содержащий логин, пароль и объект класса Basket
    //Создать несколько объектов класса User

    private String login;
    private String pass;
    Basket userBasket = new Basket();

    public User(String login, String pass, Basket userBasket) {
        this.login = login;
        this.pass = pass;
        this.userBasket = userBasket;
    }

    User vadim = new User("vadim@mail.ru0", "pass", userBasket);
}
