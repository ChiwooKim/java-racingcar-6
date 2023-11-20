package racingcar.util.validator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CarNamesValidator extends Validator {

    private final Pattern nameValidatePattern = Pattern.compile("^[a-zA-Z가-힣0-9]{1,5}$");

    @Override
    public void validate(String input) {
        String[] carNames = input.split(Constant.DELIMITER_COMMA);
        for (String carName : carNames) {
            validateNamePattern(carName);
        }
    }

    private void validateNamePattern(String carName) {
        if (!nameValidatePattern.matcher(carName).matches()) {
            throw new IllegalArgumentException("잘못된 입력양식 입니다.");
        }
    }
}
