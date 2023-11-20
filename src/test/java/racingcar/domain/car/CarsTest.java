package racingcar.domain.car;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    private Cars cars;

    @BeforeEach
    void beforeEach() {
        this.cars = new Cars();
    }

    @Test
    @DisplayName("cars에 객체가 추가 되는지 체크")
    void add() {
        cars.addCar(new Car("pobi"));
        cars.addCar(new Car("jun"));

        assertThat(cars.getCars().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("우승자 리스트 출력 체크")
    void getWinners() {
        Car pobi = new Car("pobi");
        Car jun = new Car("jun");
        Car me = new Car("me");

        pobi.move(0);
        pobi.move(1);
        pobi.move(2);
        jun.move(3);
        jun.move(4);
        jun.move(5);
        me.move(7);
        me.move(8);
        me.move(9);

        cars.addCar(pobi);
        cars.addCar(jun);
        cars.addCar(me);

        List<String> winners = cars.getWinners();

        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0)).isEqualTo("me");
    }
}