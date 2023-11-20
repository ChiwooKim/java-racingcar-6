package racingcar.controller;

import java.util.List;
import racingcar.view.InputView;

public class RacingController {

    private final InputView inputView;

    public RacingController(InputView inputView) {
        this.inputView = inputView;
    }

    public void play() {
        List<String> carNames = inputView.readCarNames();
        int attemptsNumber = inputView.readAttemptsNumber();


    }
}
