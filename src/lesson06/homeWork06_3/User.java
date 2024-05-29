package lesson06.homeWork06_3;

public class User {
    //Создать класс User, содержащий логин, пароль и объект класса Basket
    //Создать несколько объектов класса User

    private String login;
    private String pass;
    private Basket userBasket;

    public User(String login, String pass, Basket userBasket) {
        this.login = login;
        this.pass = pass;
        this.userBasket = userBasket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    @Override
    public String toString() {
        return "User: " + "login = " + login + ", pass = " + pass + ", userBasket = " + userBasket + ";";
    }
}
