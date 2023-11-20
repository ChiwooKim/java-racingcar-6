package racingcar.domain.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car car;

    @BeforeEach
    void beforeEach() {
        this.car = new Car("pobi");
    }

    @Test
    void create() {
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("정상적으로 이동하는지 체크")
    void move() {
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);

        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("우승자인지 체크")
    void isWinner() {
        int maxPosition = 2;

        car.move(4);
        assertThat(car.isWinner(maxPosition)).isFalse();

        car.move(5);
        assertThat(car.isWinner(maxPosition)).isTrue();
    }
}