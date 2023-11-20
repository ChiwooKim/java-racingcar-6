package racingcar.util.validator;

import java.util.regex.Pattern;

public class AttemptsNumbersValidator extends Validator{

    private final Pattern numberValidatePattern = Pattern.compile("^[0-9]{1,2}$");

    @Override
    public void validate(String input) {
        validateNumber(input);
    }

    private void validateNumber(String input) {
        if (!numberValidatePattern.matcher(input).matches()) {
            throw new IllegalArgumentException("1 ~ 20 회만 가능합니다.");
        }
    }
}
