package other.yelow;

public class Cakes {

    // Определите, сколько рублей и копеек нужно заплатить за N пирожков,
    // если пирожок в столовой стоит А рублей и В копеек.
    // На вход 3 числа: рубли, копейки и количество пирожков. На выходе 2 числа: рубли и копейки.


    public static void main(String[] args) {

        int a = 10;
        int b = 99;
        int n = 2;

        int sumRub = (a * n + (b * n) / 100);
        int sumKop = (b * n) % 100;

        System.out.println(sumRub + "р " + sumKop + "к");
    }
}