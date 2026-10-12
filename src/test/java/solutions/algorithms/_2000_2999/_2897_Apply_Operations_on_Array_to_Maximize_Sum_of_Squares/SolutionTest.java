package solutions.algorithms._2000_2999._2897_Apply_Operations_on_Array_to_Maximize_Sum_of_Squares;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSum1() {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        int k = 2;
        int answer = solution.maxSum(nums, k);
        Assertions.assertThat(answer).isEqualTo(261);
    }

    @Test
    void maxSum2() {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(4);
        nums.add(7);
        int k = 3;
        int answer = solution.maxSum(nums, k);
        Assertions.assertThat(answer).isEqualTo(90);
    }
}