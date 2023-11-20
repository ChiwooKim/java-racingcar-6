package racingcar.view;

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
}
