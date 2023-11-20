package racingcar.controller;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;
import racingcar.util.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Cars cars;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.cars = new Cars();
    }

    public void play() {
        outputView.printCarNamesInput();
        List<String> carNames = inputView.readCarNames();
        outputView.printAttemptsInput();
        int attemptsNumber = inputView.readAttemptsNumber();

        for (String carName : carNames) {
            cars.addCar(new Car(carName));
        }

        int count = 0;
        while (count < attemptsNumber) {
            for (Car car : cars.getCars()) {
                car.move(RandomNumberGenerator.createRandomNumber());
                outputView.printResult(car);
            }
            outputView.printSpace();
            count++;
        }
        outputView.printWinners(cars);
    }
}
