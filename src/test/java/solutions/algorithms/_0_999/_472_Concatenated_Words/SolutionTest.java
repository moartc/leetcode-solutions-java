package solutions.algorithms._0_999._472_Concatenated_Words;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findAllConcatenatedWordsInADict1() {

        String[] words = new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> answer = solution.findAllConcatenatedWordsInADict(words);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("catsdogcats", "dogcatsdog", "ratcatdogcat");
    }

    @Test
    void findAllConcatenatedWordsInADict2() {

        String[] words = new String[]{"cat", "dog", "catdog"};
        List<String> answer = solution.findAllConcatenatedWordsInADict(words);
        Assertions.assertThat(answer).containsExactly("catdog");
    }
}