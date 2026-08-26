package solutions.algorithms._2000_2999._2904_Shortest_and_Lexicographically_Smallest_Beautiful_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shortestBeautifulSubstring1() {
        String s = "100011001";
        int k = 3;
        String answer = solution.shortestBeautifulSubstring(s, k);
        Assertions.assertThat(answer).isEqualTo("11001");
    }

    @Test
    void shortestBeautifulSubstring2() {
        String s = "1011";
        int k = 2;
        String answer = solution.shortestBeautifulSubstring(s, k);
        Assertions.assertThat(answer).isEqualTo("11");
    }

    @Test
    void shortestBeautifulSubstring3() {
        String s = "000";
        int k = 1;
        String answer = solution.shortestBeautifulSubstring(s, k);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void shortestBeautifulSubstring4() {
        String s = "110101000010110101";
        int k = 3;
        String answer = solution.shortestBeautifulSubstring(s, k);
        Assertions.assertThat(answer).isEqualTo("1011");
    }
}