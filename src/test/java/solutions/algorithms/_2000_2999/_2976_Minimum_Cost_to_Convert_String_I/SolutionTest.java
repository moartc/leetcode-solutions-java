package solutions.algorithms._2000_2999._2976_Minimum_Cost_to_Convert_String_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumCost1() {
        String source = "abcd";
        String target = "acbe";
        char[] original = new char[]{'a', 'b', 'c', 'c', 'e', 'd'};
        char[] changed = new char[]{'b', 'c', 'b', 'e', 'b', 'e'};
        int[] cost = new int[]{2, 5, 5, 1, 2, 20};
        long answer = solution.minimumCost(source, target, original, changed, cost);
        Assertions.assertThat(answer).isEqualTo(28);
    }

    @Test
    void minimumCost2() {
        String source = "aaaa";
        String target = "bbbb";
        char[] original = new char[]{'a', 'c'};
        char[] changed = new char[]{'c', 'b'};
        int[] cost = new int[]{1, 2};
        long answer = solution.minimumCost(source, target, original, changed, cost);
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void minimumCost3() {
        String source = "abcd";
        String target = "abce";
        char[] original = new char[]{'a'};
        char[] changed = new char[]{'e'};
        int[] cost = new int[]{10000};
        long answer = solution.minimumCost(source, target, original, changed, cost);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}