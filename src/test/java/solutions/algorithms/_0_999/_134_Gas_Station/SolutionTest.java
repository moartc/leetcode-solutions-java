package solutions.algorithms._0_999._134_Gas_Station;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canCompleteCircuit1() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        int answer = solution.canCompleteCircuit(gas, cost);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void canCompleteCircuit2() {
        int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};
        int answer = solution.canCompleteCircuit(gas, cost);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void canCompleteCircuit3() {
        int[] gas = new int[]{5, 1, 2, 3, 4};
        int[] cost = new int[]{4, 4, 1, 5, 1};
        int answer = solution.canCompleteCircuit(gas, cost);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void canCompleteCircuit4() {
        int[] gas = new int[]{5, 8, 2, 8};
        int[] cost = new int[]{6, 5, 6, 6};
        int answer = solution.canCompleteCircuit(gas, cost);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}