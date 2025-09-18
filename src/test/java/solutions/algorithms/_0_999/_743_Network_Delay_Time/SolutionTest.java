package solutions.algorithms._0_999._743_Network_Delay_Time;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void networkDelayTime1() {
        int[][] times = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        int answer = solution.networkDelayTime(times, n, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void networkDelayTime2() {
        int[][] times = new int[][]{{1, 2, 1}};
        int n = 2;
        int k = 1;
        int answer = solution.networkDelayTime(times, n, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void networkDelayTime3() {
        int[][] times = new int[][]{{1, 2, 1}};
        int n = 2;
        int k = 2;
        int answer = solution.networkDelayTime(times, n, k);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}