package racingcar.util.validator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarNamesValidatorTest {

    private CarNamesValidator validator;

    @BeforeEach
    void beforeEach() {
        this.validator = new CarNamesValidator();
    }

    @ParameterizedTest
    @DisplayName("이름 입력 패턴 검증")
    @ValueSource(strings = {"", "pobipobi", "pobi, jun"})
    void validateCarNamePattern(String input) {
        assertThatCode(() -> validator.validate("pobi,jun"));
        assertThatThrownBy(() -> validator.validate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("특수문자를 제외한 5자 이하의 이름을 입력해주세요.");
    }

    @ParameterizedTest
    @DisplayName("입력 이름 개수")
    @ValueSource(strings = {"pobi", "pobi,jun,pobi,jun,pobi,jun,pobi,jun,pobi,"
            + "jun,pobi,jun,pobi,jun,pobi,jun,pobi,jun,pobi,jun,pobi,jun"})
    void validateCarNamesNumbers(String input) {
        assertThatCode(() -> validator.validate("pobi,jun"));
        assertThatThrownBy(() -> validator.validate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("2이상 20개 이하의 이름을 작성해 주세요.");
    }
}