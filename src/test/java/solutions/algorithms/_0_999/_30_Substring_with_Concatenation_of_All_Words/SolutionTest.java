package solutions.algorithms._0_999._30_Substring_with_Concatenation_of_All_Words;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findSubstring1() {
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};
        List<Integer> answer = solution.findSubstring(s, words);
        Assertions.assertThat(answer).containsExactly(0, 9);
    }

    @Test
    void findSubstring2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word", "good", "best", "word"};
        List<Integer> answer = solution.findSubstring(s, words);
        Assertions.assertThat(answer).isEmpty();
    }

    @Test
    void findSubstring3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = new String[]{"bar", "foo", "the"};
        List<Integer> answer = solution.findSubstring(s, words);
        Assertions.assertThat(answer).containsExactly(6, 9, 12);
    }

    @Test
    void findSubstring4() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word", "good", "best", "good"};
        List<Integer> answer = solution.findSubstring(s, words);
        Assertions.assertThat(answer).containsExactly(8);
    }

    @Test
    void findSubstring5() {
        String s = "aaa";
        String[] words = new String[]{"a", "a"};
        List<Integer> answer = solution.findSubstring(s, words);
        Assertions.assertThat(answer).containsExactly(0, 1);
    }

    @Test
    void findSubstring6() {
        String s = "axxxxxxx";
        String[] words = new String[]{"a", "a", "a"};
        List<Integer> answer = solution.findSubstring(s, words);
        Assertions.assertThat(answer).isEmpty();
    }
}