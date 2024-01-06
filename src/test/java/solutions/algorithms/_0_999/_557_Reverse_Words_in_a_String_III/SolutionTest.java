package solutions.algorithms._0_999._557_Reverse_Words_in_a_String_III;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._557_Reverse_Words_in_a_String_III.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseWordsTest1() {

        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        String actual = solution.reverseWords(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reverseWordsTest2() {

        String s = "God Ding";
        String expected = "doG gniD";
        String actual = solution.reverseWords(s);
        Assertions.assertEquals(expected, actual);
    }
}