package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.util.validator.AttemptsNumbersValidator;
import racingcar.util.validator.CarNamesValidator;
import racingcar.util.validator.Constant;
import racingcar.util.validator.Validator;

public class InputView {

    private final Validator namesValidator;
    private final Validator attempsValidator;

    private InputView() {
        this.namesValidator = new CarNamesValidator();
        this.attempsValidator = new AttemptsNumbersValidator();
    }

    public static InputView getInstance() {
        return new InputView();
    }

    public List<String> readCarNames() {
        String input = input();
        namesValidator.validate(input);
        return Arrays.asList(input.split(Constant.DELIMITER_COMMA));
    }

    public int readAttemptsNumber() {
        String input = input();
        attempsValidator.validate(input);
        return Integer.parseInt(input);
    }

    private String input() {
        return Console.readLine();
    }
}
