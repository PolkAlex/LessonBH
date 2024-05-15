package lesson04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson04 {
//--------------practice--------------
// переворот строки
    public static void main(String[] args) {
        String text = "Reverse";
//        reverseMethod(text);
        String emails = getEmails("afwegweg, gewwe-gwagg@gmail.com, gwegwg@.rygw, wegwegwegwe weg we we w ");
    }

    public static void reverseMethod (String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        String reverseText = sb.toString();
        System.out.println(reverseText);
    }
//--------------practice--------------
// регулярные выражения
    public static String getEmails (String text) {

        String reg = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,7}";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);

        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            String group = matcher.group();
            stringBuilder.append(group);
            stringBuilder.append("; ");
        }
        return stringBuilder.toString();
    }
}