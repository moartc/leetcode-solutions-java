package solutions.algorithms._1000_1999._1846_Maximum_Element_After_Decreasing_and_Rearranging;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumElementAfterDecrementingAndRearranging1() {
        int[] arr = new int[]{2, 2, 1, 2, 1};
        int answer = solution.maximumElementAfterDecrementingAndRearranging(arr);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging2() {
        int[] arr = new int[]{100, 1, 1000};
        int answer = solution.maximumElementAfterDecrementingAndRearranging(arr);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging3() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int answer = solution.maximumElementAfterDecrementingAndRearranging(arr);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging4() {
        int[] arr = new int[]{1, 2, 2, 4,};
        int answer = solution.maximumElementAfterDecrementingAndRearranging(arr);
        Assertions.assertThat(answer).isEqualTo(3);
    }

}