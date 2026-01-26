package solutions.algorithms._0_999._978_Longest_Turbulent_Subarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxTurbulenceSize1() {
        int[] arr = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};
        int answer = solution.maxTurbulenceSize(arr);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maxTurbulenceSize2() {
        int[] arr = new int[]{4, 8, 12, 16};
        int answer = solution.maxTurbulenceSize(arr);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxTurbulenceSize3() {
        int[] arr = new int[]{100};
        int answer = solution.maxTurbulenceSize(arr);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxTurbulenceSize4() {
        int[] arr = new int[]{0, 8, 45, 88, 48, 68, 28, 55, 17, 24};
        int answer = solution.maxTurbulenceSize(arr);
        Assertions.assertThat(answer).isEqualTo(8);
    }

}