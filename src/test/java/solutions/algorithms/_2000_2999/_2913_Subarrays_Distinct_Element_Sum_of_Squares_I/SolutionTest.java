package solutions.algorithms._2000_2999._2913_Subarrays_Distinct_Element_Sum_of_Squares_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumCounts1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 1));
        int answer = solution.sumCounts(nums);
        Assertions.assertThat(answer).isEqualTo(15);
    }

    @Test
    void sumCounts2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1));
        int answer = solution.sumCounts(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}