package racingcar.util;

public class InputValidator {


    public static void tryCountValidator(String countNumber) {
        if (countNumber.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (Integer.parseInt(countNumber) == 0) {
            throw new IllegalArgumentException();
        }
    }
}
