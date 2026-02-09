package solutions.algorithms._0_999._65_Valid_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isNumber1() {
        String s = "0";
        boolean answer = solution.isNumber(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isNumber2() {
        String s = "e";
        boolean answer = solution.isNumber(s);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isNumber3() {
        String s = ".";
        boolean answer = solution.isNumber(s);
        Assertions.assertThat(answer).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {"2",
            "0089",
            "-0.1",
            "+3.14",
            "4.",
            "-.9",
            "2e10",
            "-90E3",
            "3e+7",
            "+6e-1",
            "53.5e93",
            "-123.456e789",
            "46.e3"})
    void isNumberValid(String s) {
        boolean answer = solution.isNumber(s);
        Assertions.assertThat(answer).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "1a",
            "1e",
            "e3",
            "99e2.5",
            "--6",
            "-+3",
            "95a54e53",
            "-.E3",
            "+E3",
            "+"})
    void isNumberNotValid(String s) {
        boolean answer = solution.isNumber(s);
        Assertions.assertThat(answer).isFalse();
    }
}