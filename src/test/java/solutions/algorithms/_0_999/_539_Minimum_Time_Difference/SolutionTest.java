package solutions.algorithms._0_999._539_Minimum_Time_Difference;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMinDifference1() {
        List<String> timePoints = List.of("23:59", "00:00");
        int answer = solution.findMinDifference(timePoints);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void findMinDifference2() {
        List<String> timePoints = List.of("00:00", "23:59", "00:00");
        int answer = solution.findMinDifference(timePoints);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}