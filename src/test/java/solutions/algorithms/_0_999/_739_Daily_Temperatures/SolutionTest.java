package solutions.algorithms._0_999._739_Daily_Temperatures;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void dailyTemperaturesTest1() {
        int[] input = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] output = solution.dailyTemperatures(input);
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void dailyTemperaturesTest2() {
        int[] input = new int[]{30, 40, 50, 60};
        int[] output = solution.dailyTemperatures(input);
        int[] expected = new int[]{1, 1, 1, 0};
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void dailyTemperaturesTest3() {
        int[] input = new int[]{30, 60, 90};
        int[] output = solution.dailyTemperatures(input);
        int[] expected = new int[]{1, 1, 0};
        Assertions.assertThat(output).isEqualTo(expected);
    }
}