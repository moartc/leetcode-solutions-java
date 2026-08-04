package solutions.algorithms._0_999._12_Integer_to_Roman;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void intToRoman1() {
        int num = 3749;
        String answer = solution.intToRoman(num);
        Assertions.assertThat(answer).isEqualTo("MMMDCCXLIX");
    }

    @Test
    void intToRoman2() {
        int num = 58;
        String answer = solution.intToRoman(num);
        Assertions.assertThat(answer).isEqualTo("LVIII");
    }

    @Test
    void intToRoman3() {
        int num = 1994;
        String answer = solution.intToRoman(num);
        Assertions.assertThat(answer).isEqualTo("MCMXCIV");
    }
}