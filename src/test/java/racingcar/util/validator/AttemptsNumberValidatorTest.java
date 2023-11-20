package racingcar.util.validator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AttemptsNumberValidatorTest {

    private AttemptsNumberValidator validator;

    @BeforeEach
    void beforeEach() {
        this.validator = new AttemptsNumberValidator();
    }

    @ParameterizedTest
    @DisplayName("시도 횟수 숫자 인지 검증")
    @ValueSource(strings = {"일", "one", "", "1 "})
    void validateNumber(String input) {
        assertThatCode(() -> validator.validate("7"));
        assertThatThrownBy(() -> validator.validate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 이상 20 이하의 숫자만 입력해주세요.");
    }

    @ParameterizedTest
    @DisplayName("시도 횟수 범위 검증")
    @ValueSource(strings = {"0", "21"})
    void validateNumberPattern(String input) {
        assertThatCode(() -> validator.validate("7"));
        assertThatThrownBy(() -> validator.validate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 이상 20 이하의 숫자만 입력해주세요.");
    }
}