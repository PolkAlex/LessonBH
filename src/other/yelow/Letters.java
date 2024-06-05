package other.yelow;

public class Letters {

    // Написать метод, принимающий два аргумента - слово и букву.
    // Метод должен посчитать, сколько раз эта буква встречается в данном слове, и вернуть полученное число вхождений.
    // И то же самое без учета регистра.

    public static void main(String[] args) {

        System.out.println(count("корОва".toLowerCase(), 'о'));
        replaceNumber("1 командир приказывает солдатам(6 бойцов) убрать снег(2 плаца) лопатой");
    }

    public static int count(String word, char letter) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                result++;
            }
        }
        return result;
    }

    // Написать метод, принимающий строку. Метод должен заменять все числа словами.

    public static void replaceNumber(String word) {
        System.out.println(word.replace("1", "один")
                .replace("2", "два")
                .replace("6", "шесть"));
    }
}