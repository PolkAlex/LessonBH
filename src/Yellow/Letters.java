package Yellow;

public class Letters {

    public static void main(String[] args) {

        System.out.println(count("корОва".toLowerCase(), 'о'));
        replaceNumber("1,2,5");
    }

    public static int count (String word, char letter) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                result++;
            }
        }
        return result;
    }

    public static void replaceNumber (String word) {
        System.out.println(word.replace("1", "один")
                .replace("2", "два")
                .replace("3", "три"));
    }


}
