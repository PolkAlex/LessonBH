package lesson06.dz06_1;

public class Main extends Phone {

    public static void main(String[] args) {

        Phone iphone = new Phone(777, "15 PRO Max", 130.34);
        Phone samsung = new Phone(888, "Galaxy S24", 128.09);
        Phone xiaomi = new Phone(111, "Poco 13 Ultra", 140.52);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(xiaomi);

        iphone.receiveCall("Yulia");
        System.out.println("Number: " + iphone.getNumber(777));
        samsung.receiveCall("John");
        System.out.println("Number: " + samsung.getNumber(568));
        xiaomi.receiveCall("Viktor");
        System.out.println("Number: " + xiaomi.getNumber(648));

        iphone.receiveCall("James", 1684);
    }
}