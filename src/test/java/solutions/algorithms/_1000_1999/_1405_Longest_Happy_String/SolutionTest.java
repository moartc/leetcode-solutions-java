package solutions.algorithms._1000_1999._1405_Longest_Happy_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestDiverseString1() {
        int a = 1;
        int b = 1;
        int c = 7;
        String answer = solution.longestDiverseString(a, b, c);
        Assertions.assertThat(answer).isEqualTo("ccaccbcc");
    }

    @Test
    void longestDiverseString2() {
        int a = 7;
        int b = 1;
        int c = 0;
        String answer = solution.longestDiverseString(a, b, c);
        Assertions.assertThat(answer).isEqualTo("aabaa");
    }
}