package solutions.algorithms._228_Summary_Ranges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void summaryRangesTest1() {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> expected = List.of("0->2", "4->5", "7");
        List<String> actual = solution.summaryRanges(nums);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void summaryRangesTest2() {
        int[] nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        List<String> expected = List.of("0", "2->4", "6", "8->9");
        List<String> actual = solution.summaryRanges(nums);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void summaryRangesTest3() {
        int[] nums = new int[0];
        List<String> expected = List.of();
        List<String> actual = solution.summaryRanges(nums);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void summaryRangesTest4() {
        int[] nums = new int[]{-1};
        List<String> expected = List.of("-1");
        List<String> actual = solution.summaryRanges(nums);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void summaryRangesTest5() {
        int[] nums = new int[]{0};
        List<String> expected = List.of("0");
        List<String> actual = solution.summaryRanges(nums);
        Assertions.assertIterableEquals(expected, actual);
    }
}