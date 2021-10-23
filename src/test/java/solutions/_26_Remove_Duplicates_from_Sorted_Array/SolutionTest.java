package solutions._26_Remove_Duplicates_from_Sorted_Array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void removeDuplicatesTest1() {

        int[] expectedNums = new int[]{1, 2};
        int[] nums = new int[]{1, 1, 2};
        checkAssert(expectedNums, nums);
    }

    @Test
    void removeDuplicatesTest2() {

        int[] expectedNums = new int[]{0, 1, 2, 3, 4};
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        checkAssert(expectedNums, nums);
    }

    @Test
    void removeDuplicatesTest3() {

        int[] expectedNums = new int[]{1, 2};
        int[] nums = new int[]{1, 1, 2, 2};
        checkAssert(expectedNums, nums);
    }

    public void checkAssert(int[] expected, int[] input) {
        int actual = solution.removeDuplicates(input);
        assertEquals(expected.length, actual);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], input[i]);
        }
    }
}