package solutions.algorithms._3000_3999._3364_Minimum_Positive_Sum_Subarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumSumSubarray1() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -2, 1, 4));
        int l = 2;
        int r = 3;
        int answer = solution.minimumSumSubarray(nums, l, r);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minimumSumSubarray2() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-2, 2, -3, 1));
        int l = 2;
        int r = 3;
        int answer = solution.minimumSumSubarray(nums, l, r);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void minimumSumSubarray3() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int l = 2;
        int r = 4;
        int answer = solution.minimumSumSubarray(nums, l, r);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minimumSumSubarray4() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-12, 8));
        int l = 1;
        int r = 1;
        int answer = solution.minimumSumSubarray(nums, l, r);
        Assertions.assertThat(answer).isEqualTo(8);
    }
}