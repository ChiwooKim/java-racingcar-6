package racingcar.util.validator;

import java.util.regex.Pattern;

public class AttemptsNumbersValidator extends Validator{

    private static final int ATTEMPTS_MIN_RANGE = 1;
    private static final int ATTEMPTS_MAX_RANGE = 20;
    private final Pattern numberValidatePattern = Pattern.compile("^[0-9]{1,2}$");

    @Override
    public void validate(String input) {
        validateNumber(input);
        validateNumberRange(input);
    }

    private void validateNumberRange(String input) {
        int number = Integer.parseInt(input);
        if (number < ATTEMPTS_MIN_RANGE || number > ATTEMPTS_MAX_RANGE) {
            throw new IllegalArgumentException("1 이상 20 이하의 숫자만 입력해주세요.");
        }
    }

    private void validateNumber(String input) {
        if (!numberValidatePattern.matcher(input).matches()) {
            throw new IllegalArgumentException("1 이상 20 이하의 숫자만 입력해주세요.");
        }
    }
}
