package solutions.algorithms._1000_1999._1111_Maximum_Nesting_Depth_of_Two_Valid_Parentheses_Strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxDepthAfterSplit1() {
        String seq = "(()())";
        int[] answer = solution.maxDepthAfterSplit(seq);
        Assertions.assertThat(answer).containsExactly(0, 1, 1, 1, 1, 0);
    }

    @Test
    void maxDepthAfterSplit2() {
        String seq = "()(())()";
        int[] answer = solution.maxDepthAfterSplit(seq);
        // changed specifically for my solution, because of:
        // "Note that even though multiple answers may exist, you may return any of them"
        Assertions.assertThat(answer).containsExactly(0, 0, 0, 1, 1, 0, 0, 0);
    }
}