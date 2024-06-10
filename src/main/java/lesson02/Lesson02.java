package lesson02;

public class Lesson02 {

    public static void main(String[] args) {
//
//        //--------------theory--------------
//
//        String s = "72";
//        int i = Integer.parseInt(s); //преобразовать строку в число
//
//        int a = 84;
//        String sq = Integer.toString(a); // преобразовать число в строку
//
//        int x = 10;
//        int er = 3;
//
//        System.out.println(er += x);
//        er = er + x; // идентично er += x;
//
//        int k = (a > 123) ? 1 : 2; // если a > 123, то k = 1, иначе k = 2
//        System.out.println(k);
//
//        //--------------practice--------------

//        Scanner scanner = new Scanner(System.in);
////        String s = scanner.nextLine();
////
////        System.out.println(s);
//
//         int [] array = new int[5];
//
//        for (int i = 0; i < array.length; i++) {
//            String s = scanner.nextLine();
//            array[i] = Integer.parseInt(s);
//        }
//
//        for (int i : array) {
//            System.out.println(array[i]);
//        }
        //--------------practice--------------
//        int x = 10;
//        boolean y = x >5;
//        boolean f = x < 20;
//
//        if (y) {
//            System.out.println("Значение x больше 5");
//        } else if (f){
//            System.out.println("Значение меньше 20");
//        }
//        else {
//            System.out.println("Значение x меньше 5");
//        }
        //--------------practice--------------
//
//        int x = 3;
//
//        switch (x) {
//            case 1 : // после слова case пишем x
//                System.out.println("Значение 1");
//                break;
//            case 2 : // после слова case пишем x
//                System.out.println("Значение 2");
//                break;
//            case 3 : // после слова case пишем x
//                System.out.println("Значение 3");
//                break;
//            default:
//                System.out.println("Неизвестное значение");
//        }
        //--------------practice--------------
//
//        int x = 1;
//        boolean b = x == 1;
//
//        do {
//            System.out.println("Метод do");
//            b = false;
//        }while (b);
        //--------------practice--------------

        int x = 1;
        boolean b = x == 1;

        while (b) {
            System.out.println("Цикл while");
        }
    }
}