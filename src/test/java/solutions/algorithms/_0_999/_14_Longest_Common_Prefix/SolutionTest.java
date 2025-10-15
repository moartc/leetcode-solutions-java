package solutions.algorithms._0_999._14_Longest_Common_Prefix;

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
    void longestCommonPrefixTest1() {

        String[] input = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        String actual = solution.longestCommonPrefix(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixTest2() {

        String[] input = new String[]{"dog", "racecar", "car"};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixTest3() {

        String[] input = new String[]{"ab", "a"};
        String expected = "a";
        String actual = solution.longestCommonPrefix(input);
        Assertions.assertEquals(expected, actual);
    }
}