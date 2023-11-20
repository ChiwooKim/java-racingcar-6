package racingcar.view;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;

public class OutputView {

    private OutputView() {
    }

    public static OutputView getInstance() {
        return new OutputView();
    }

    public void printCarNamesInput() {
        System.out.println(Message.INPUT_CAR_NAMES.getMessage());
    }

    public void printAttemptsInput() {
        System.out.println(Message.INPUT_ATTEMPTS_NUMBER.getMessage());
    }

    public void printExecutionResult() {
        System.out.printf(Message.EXECUTION_RESULT.getMessage());
    }

    public void printResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.printf(Message.RESULT_FORM.getMessage(), car.getName(),
                    Message.POSITION_MARK.getMessage().repeat(car.getPosition()));
        }
    }

    public void printSpace() {
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.printf(Message.WINNERS.getMessage(),
                String.join(Message.WINNERS_DELIMITER.getMessage(), winners));
    }

    private enum Message {
        INPUT_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
        INPUT_ATTEMPTS_NUMBER("시도할 회수는 몇회인가요?"),
        EXECUTION_RESULT("%n실행결과%n"),
        RESULT_FORM("%s : %s%n"),
        POSITION_MARK("-"),
        WINNERS("최종 우승자 : %s%n"),
        WINNERS_DELIMITER(", ");

        private final String message;

        Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
