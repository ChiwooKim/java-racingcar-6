package racingcar.domain.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<String> getWinners() {
        return cars.stream()
                .filter(car -> car.isWinner(getMaxPosition()))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return Collections.max(cars.stream()
                .map(Car::getPosition).toList());
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
