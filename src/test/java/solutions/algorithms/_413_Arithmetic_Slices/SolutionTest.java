package solutions.algorithms._413_Arithmetic_Slices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfArithmeticSlicesTest1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 3;
        int actual = solution.numberOfArithmeticSlices(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfArithmeticSlicesTest2() {
        int[] nums = new int[]{1};
        int expected = 0;
        int actual = solution.numberOfArithmeticSlices(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfArithmeticSlicesTest3() {
        int[] nums = new int[]{1, 3, 5};
        int expected = 1;
        int actual = solution.numberOfArithmeticSlices(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfArithmeticSlicesTest4() {
        int[] nums = new int[]{1, 2, 3, 5, 7};
        int expected = 2;
        int actual = solution.numberOfArithmeticSlices(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfArithmeticSlicesTest5() {
        int[] nums = new int[]{1, 2, 3, 5};
        int expected = 1;
        int actual = solution.numberOfArithmeticSlices(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfArithmeticSlicesTest6() {
        int[] nums = new int[]{1, 2, 3, 8, 9, 10};
        int expected =2;
        int actual = solution.numberOfArithmeticSlices(nums);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getSlicesNbTest1() {
        int actual = solution.getSlicesNb(3);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void getSlicesNbTest2() {
        int actual = solution.getSlicesNb(4);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void getSlicesNbTest3() {
        int actual = solution.getSlicesNb(5);
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void getSlicesNbTest4() {
        int actual = solution.getSlicesNb(6);
        assertThat(actual).isEqualTo(10);
    }

    @Test
    void getSlicesNbTest5() {
        int actual = solution.getSlicesNb(7);
        assertThat(actual).isEqualTo(15);
    }
}