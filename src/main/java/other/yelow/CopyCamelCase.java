package other.yelow;

public class CopyCamelCase {

    //Написать простую функцию, которая возвращает копию строки,
    // в которой каждое слово начинается с заглавной буквы.

    public static void main(String[] args) {

        String words = "малиновый банан приплыл из арктики";
        String upperWords = "";
        String[] arrayOfWords = words.split(" ");
        for (String word : arrayOfWords) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            upperWords = upperWords + first + all + " ";
        }
        System.out.println(upperWords);
    }
}
