package solutions.algorithms._0_999._53_Maximum_Subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void maxSubArrayTest1() {

        int input[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, solution.maxSubArray(input));
    }

    @Test
    void maxSubArrayTest2() {

        int input[] = new int[]{1};
        Assertions.assertEquals(1, solution.maxSubArray(input));
    }

    @Test
    void maxSubArrayTest3() {

        int input[] = new int[]{5, 4, -1, 7, 8};
        Assertions.assertEquals(23, solution.maxSubArray(input));
    }
}