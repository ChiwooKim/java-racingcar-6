package racingcar.domain.car;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
