package solutions.algorithms._0_999._131_Palindrome_Partitioning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {

        String s = "aab";

        List<List<String>> answer = solution.partition(s);

        Assertions.assertThat(answer).containsExactlyInAnyOrder(List.of("a", "a", "b"), List.of("aa", "b"));
    }

    @Test
    void test2() {

        String s = "a";

        List<List<String>> answer = solution.partition(s);

        Assertions.assertThat(answer).containsExactlyInAnyOrder(List.of("a"));
    }

    @Test
    void test3() {

        String s = "abcbaxyx";

        List<List<String>> answer = solution.partition(s);

        Assertions.assertThat(answer).containsExactlyInAnyOrder(
                List.of("a", "b", "c", "b", "a", "x", "y", "x"),
                List.of("a", "b", "c", "b", "a", "xyx"),
                List.of("a", "bcb", "a", "x", "y", "x"),
                List.of("a", "bcb", "a", "xyx"),
                List.of("abcba", "x", "y", "x"),
                List.of("abcba", "xyx")
        );
    }
}