package other.yelow;

public class KataBasicMathOperations {

    public static Integer basicMath(String op, int v1, int v2) {

        Integer result = 0;

        if (op.equals("+")) {
            return result = v1 + v2;
        } else if (op.equals("-")) {
            return result = v1 - v2;
        } else if (op.equals("*")) {
            return result = v1 * v2;
        } else if (op.equals("/")) {
            return result = v1 / v2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 1, 1));
    }
}
