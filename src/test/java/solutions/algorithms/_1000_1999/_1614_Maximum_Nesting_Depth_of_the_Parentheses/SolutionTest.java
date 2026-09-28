package solutions.algorithms._1000_1999._1614_Maximum_Nesting_Depth_of_the_Parentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxDepth1() {
        String s = "(1+(2*3)+((8)/4))+1";
        int answer = solution.maxDepth(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxDepth2() {
        String s = "(1)+((2))+(((3)))";
        int answer = solution.maxDepth(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxDepth3() {
        String s = "()(())((()()))";
        int answer = solution.maxDepth(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}