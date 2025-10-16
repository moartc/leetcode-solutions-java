package solutions.algorithms._0_999._27_Remove_Element;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void removeElementTest1() {

        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = new int[]{2, 2};
        checkAssert(expectedNums, nums, val);
    }

    @Test
    void removeElementTest2() {

        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = new int[]{0, 1, 4, 0, 3};
        checkAssert(expectedNums, nums, val);
    }

    @Test
    void removeElementTest3() {

        int[] nums = new int[]{2};
        int val = 3;
        int[] expectedNums = new int[]{2};
        checkAssert(expectedNums, nums, val);
    }

    @Test
    void removeElementTest4() {

        int[] nums = new int[]{};
        int val = 0;
        int[] expectedNums = new int[]{};
        checkAssert(expectedNums, nums, val);
    }

    @Test
    void removeElementTest5() {

        int[] nums = new int[]{3, 3};
        int val = 5;
        int[] expectedNums = new int[]{3, 3};
        checkAssert(expectedNums, nums, val);
    }

    @Test
    void removeElementTest6() {

        int[] nums = new int[]{3, 3};
        int val = 5;
        int[] expectedNums = new int[]{3, 3};
        checkAssert(expectedNums, nums, val);
    }

    @Test
    void removeElementTest7() {

        int[] nums = new int[]{3, 3};
        int val = 3;
        int[] expectedNums = new int[]{};
        checkAssert(expectedNums, nums, val);
    }

    public void checkAssert(int[] expected, int[] input, int value) {

        int result = solution.removeElement(input, value);
        Arrays.sort(input, 0, result);
        Arrays.sort(expected);
        assertEquals(expected.length, result);
        for (int i = 0; i < result; i++) {
            assertEquals(expected[i], input[i]);
        }
    }
}