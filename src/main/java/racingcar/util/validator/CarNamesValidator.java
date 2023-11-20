package racingcar.util.validator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CarNamesValidator extends Validator {

    private static final int CAR_NAMES_MIN_RANGE = 2;
    private static final int CAR_NAMES_MAX_RANGE = 20;
    private final Pattern nameValidatePattern = Pattern.compile("^[a-zA-Z가-힣0-9]{1,5}$");

    @Override
    public void validate(String input) {
        List<String> carNames = Arrays.asList(input.split(Constant.DELIMITER_COMMA));
        validateIterator(carNames);
        validateCarNamesNumbers(carNames);
    }

    private void validateIterator(List<String> carNames) {
        for (String carName : carNames) {
            validateNamePattern(carName);
        }
    }

    private void validateNamePattern(String carName) {
        if (!nameValidatePattern.matcher(carName).matches()) {
            throw new IllegalArgumentException("한글, 영어, 숫자를 포함한 5자 이하의 이름을 , 구분하여 입력해주세요");
        }
    }

    private void validateCarNamesNumbers(List<String> carNames) {
        if (carNames.size() < CAR_NAMES_MIN_RANGE || carNames.size() > CAR_NAMES_MAX_RANGE) {
            throw new IllegalArgumentException("2이상 20개 이하의 이름을 작성해 주세요.");
        }
    }
}
