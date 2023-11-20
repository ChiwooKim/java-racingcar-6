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
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = input();
        namesValidator.validate(input);
        return Arrays.asList(input.split(Constant.DELIMITER_COMMA));
    }

    public int readAttemptsNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = input();
        attempsValidator.validate(input);
        return Integer.parseInt(input);
    }

    private String input() {
        return Console.readLine();
    }
}
