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
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printAttemptsInput() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printExecutionResult() {
        System.out.printf("%n실행결과%n");
    }

    public void printResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.printf("%s : %s%n", car.getName(), "-".repeat(car.getPosition()));
        }
    }

    public void printSpace() {
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.printf("최종 우승자 : %s%n", String.join(", ", winners));
    }
}
