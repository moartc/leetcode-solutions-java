package solutions.algorithms._0_999._162_Find_Peak_Element;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._162_Find_Peak_Element.Solution;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findPeakElementTest1() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertThat(solution.findPeakElement(nums)).isEqualTo(2);
    }

    @Test
    void findPeakElementTest2() {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        int actual = solution.findPeakElement(nums);
        assertThat(actual == 2 || actual == 5).isTrue();
    }

    @Test
    void findPeakElementTest3() {
        int[] nums = new int[]{1};
        assertThat(solution.findPeakElement(nums)).isEqualTo(0);
    }

    @Test
    void findPeakElementTest4() {
        int[] nums = new int[]{1, 2};
        assertThat(solution.findPeakElement(nums)).isEqualTo(1);
    }

    @Test
    void findPeakElementTest5() {
        int[] nums = new int[]{3, 2};
        assertThat(solution.findPeakElement(nums)).isEqualTo(0);
    }

    @Test
    void findPeakElementTest6() {
        int[] nums = new int[]{3, 2, 1};
        assertThat(solution.findPeakElement(nums)).isEqualTo(0);
    }
}