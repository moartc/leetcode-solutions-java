package solutions.algorithms._1000_1999._1524_Number_of_Sub_arrays_With_Odd_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numOfSubarrays1() {
        int[] arr = new int[]{1, 3, 5};
        int answer = solution.numOfSubarrays(arr);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void numOfSubarrays2() {
        int[] arr = new int[]{2, 4, 6};
        int answer = solution.numOfSubarrays(arr);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void numOfSubarrays3() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int answer = solution.numOfSubarrays(arr);
        Assertions.assertThat(answer).isEqualTo(16);
    }
}