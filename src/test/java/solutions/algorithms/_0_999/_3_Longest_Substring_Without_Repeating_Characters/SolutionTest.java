package solutions.algorithms._0_999._3_Longest_Substring_Without_Repeating_Characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._3_Longest_Substring_Without_Repeating_Characters.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lengthOfLongestSubstringTest1() {
        String s = "abcabcbb";
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest2() {
        String s = "bbbbb";
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest3() {
        String s = "pwwkew";
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest4() {
        String s = "aa";
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest5() {
        String s = "ab";
        Assertions.assertEquals(2, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest6() {
        String s = "aab";
        Assertions.assertEquals(2, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest7() {
        String s = "ohomm";
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstringTest8() {
        String s = "jbpnbwwd";
        Assertions.assertEquals(4, solution.lengthOfLongestSubstring(s));
    }

}