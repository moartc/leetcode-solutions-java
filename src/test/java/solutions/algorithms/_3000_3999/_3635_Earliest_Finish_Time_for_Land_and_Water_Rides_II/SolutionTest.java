package solutions.algorithms._3000_3999._3635_Earliest_Finish_Time_for_Land_and_Water_Rides_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void earliestFinishTime1() {
        int[] landStartTime = new int[]{2, 8};
        int[] landDuration = new int[]{4, 1};
        int[] waterStartTime = new int[]{6};
        int[] waterDuration = new int[]{3};
        int answer = solution.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void earliestFinishTime2() {
        int[] landStartTime = new int[]{5};
        int[] landDuration = new int[]{3};
        int[] waterStartTime = new int[]{1};
        int[] waterDuration = new int[]{10};
        int answer = solution.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        Assertions.assertThat(answer).isEqualTo(14);
    }
}