package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {

    private static final String DELIMITER = ",";

    private InputView() {
    }

    public static InputView getInstance() {
        return new InputView();
    }

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> carNames = Arrays.asList(input().split(DELIMITER));
        return carNames;
    }

    public int readAttemptsNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = input();
        return Integer.parseInt(input);
    }

    private String input() {
        return Console.readLine();
    }
}
