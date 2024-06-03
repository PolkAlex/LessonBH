package lesson09.exceptions;

public class ValidateAgeException extends RuntimeException {

    public ValidateAgeException (int curremtAge, int availableAge) {

        super("Current age less than available" + curremtAge + ", " + availableAge);
    }
}
