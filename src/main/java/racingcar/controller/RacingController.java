package racingcar.controller;

import racingcar.domain.car.Cars;
import racingcar.service.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RacingService racingService;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingService = new RacingService();
    }

    public void play() {
        startRacing(readyForRacing());
        outputView.printWinners(racingService.winPrize());
    }

    private int readyForRacing() {
        outputView.printCarNamesInput();
        racingService.getReady(inputView.readCarNames());
        outputView.printAttemptsInput();
        return inputView.readAttemptsNumber();
    }

    private void startRacing(int attemptsNumber) {
        outputView.printExecutionResult();
        int count = 0;
        while (count < attemptsNumber) {
            Cars result = racingService.doRacing();
            outputView.printResult(result);
            outputView.printSpace();
            count++;
        }
    }
}
