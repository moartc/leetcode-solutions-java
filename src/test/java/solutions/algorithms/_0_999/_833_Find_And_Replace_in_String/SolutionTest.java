package solutions.algorithms._0_999._833_Find_And_Replace_in_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findReplaceString1() {
        String s = "abcd";
        int[] indices = new int[]{0, 2};
        String[] sources = new String[]{"a", "cd"};
        String[] targets = new String[]{"eee", "ffff"};
        String answer = solution.findReplaceString(s, indices, sources, targets);
        Assertions.assertThat(answer).isEqualTo("eeebffff");
    }

    @Test
    void findReplaceString2() {
        String s = "abcd";
        int[] indices = new int[]{0, 2};
        String[] sources = new String[]{"ab", "ec"};
        String[] targets = new String[]{"eee", "ffff"};
        String answer = solution.findReplaceString(s, indices, sources, targets);
        Assertions.assertThat(answer).isEqualTo("eeecd");
    }

    @Test
    void findReplaceString3() {
        String s = "abcde";
        int[] indices = new int[]{2, 2, 3};
        String[] sources = new String[]{"cde", "cdef", "dk"};
        String[] targets = new String[]{"fe", "f", "xyz"};
        String answer = solution.findReplaceString(s, indices, sources, targets);
        Assertions.assertThat(answer).isEqualTo("abfe");
    }
}