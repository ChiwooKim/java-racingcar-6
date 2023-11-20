package racingcar.service;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;
import racingcar.util.RandomNumberGenerator;

public class RacingService {

    private final Cars cars;

    public RacingService() {
        this.cars = new Cars();
    }

    public void getReady(List<String> carNames) {
        for (String carName : carNames) {
            cars.addCar(new Car(carName));
        }
    }

    public Cars doRacing() {
        for (Car car : cars.getCars()) {
            car.move(RandomNumberGenerator.createRandomNumber());
        }
        return cars;
    }

    public List<String> winPrize() {
        return cars.getWinners();
    }
}
