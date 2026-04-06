package solutions.algorithms._3000_3999._3713_Longest_Balanced_Substring_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestBalanced1() {
        String s = "abbac";
        int answer = solution.longestBalanced(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestBalanced2() {
        String s = "zzabccy";
        int answer = solution.longestBalanced(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestBalanced3() {
        String s = "aba";
        int answer = solution.longestBalanced(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}