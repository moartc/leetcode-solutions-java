package solutions.algorithms._1000_1999._1477_Find_Two_Non_overlapping_Sub_arrays_Each_With_Target_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSumOfLengths1() {
        int[] arr = new int[]{3, 2, 2, 4, 3};
        int target = 3;
        int answer = solution.minSumOfLengths(arr, target);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minSumOfLengths2() {
        int[] arr = new int[]{7, 3, 4, 7};
        int target = 7;
        int answer = solution.minSumOfLengths(arr, target);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minSumOfLengths3() {
        int[] arr = new int[]{4, 3, 2, 6, 2, 3, 4};
        int target = 6;
        int answer = solution.minSumOfLengths(arr, target);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void minSumOfLengths4() {
        int[] arr = new int[]{2, 2, 2, 2, 4, 6, 2};
        int target = 6;
        int answer = solution.minSumOfLengths(arr, target);
        Assertions.assertThat(answer).isEqualTo(3);
    }

}