package racingcar.view;

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

    public void printResult(Car car) {
        System.out.printf("%s : %s%n", car.getName(), "-".repeat(car.getPosition()));
    }

    public void printSpace() {
        System.out.println();
    }

    public void printWinners(Cars cars) {
        System.out.printf("최종 우승자 : %s%n", String.join(", ", cars.getWinners()));
    }
}
