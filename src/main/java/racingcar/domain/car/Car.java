package racingcar.domain.car;

public class Car {

    private static final int MOVE_MIN_NUMBER = 4;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public void move(int number) {
        if (isMove(number)) {
            position++;
        }
    }

    private boolean isMove(int number) {
        return number >= MOVE_MIN_NUMBER;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
