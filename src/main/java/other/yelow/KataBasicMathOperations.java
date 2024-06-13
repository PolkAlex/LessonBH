package other.yelow;

public class KataBasicMathOperations {

    public static Integer basicMath(String op, int v1, int v2) {

        int result = 0;

        switch (op) {
            case "+":
                return result = v1 + v2;
            case "-":
                return result = v1 - v2;
            case "*":
                return result = v1 * v2;
            case "/":
                return result = v1 / v2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("/", 9, 3));
    }
}