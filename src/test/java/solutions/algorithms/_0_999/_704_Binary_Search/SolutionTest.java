package solutions.algorithms._0_999._704_Binary_Search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.algorithms._0_999._704_Binary_Search.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({"-1,0", "0,1", "3,2", "5,3", "9,4", "12,5",
            "-2,-1", "1,-1", "2,-1", "4,-1", "10,-1", "13,-1"})
    void searchTest1(int target, int expected) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int actual = solution.search(nums, target);
        Assertions.assertEquals(expected, actual);
    }
}