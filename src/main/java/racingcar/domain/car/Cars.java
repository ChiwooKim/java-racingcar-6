package racingcar.domain.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.util.RandomNumberGenerator;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
