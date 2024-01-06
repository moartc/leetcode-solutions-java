package solutions.algorithms._0_999._567_Permutation_in_String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._567_Permutation_in_String.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkInclusionTest1() {
        String s1 = "ab", s2 = "eidbaooo";
        Assertions.assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusionTest2() {
        String s1 = "ab", s2 = "eidboaoo";
        Assertions.assertFalse(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusionTest3() {
        String s1 = "adc", s2 = "dcda";
        Assertions.assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusionTest4() {
        String s1 = "hello", s2 = "ooolleoooleh";
        Assertions.assertFalse(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusionTest5() {
        String s1 = "ab", s2 = "a";
        Assertions.assertFalse(solution.checkInclusion(s1, s2));
    }
}
