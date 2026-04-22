package solutions.algorithms._2000_2999._2452_Words_Within_Two_Edits_of_Dictionary;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void twoEditWords1() {
        String[] queries = new String[]{"word", "note", "ants", "wood"};
        String[] dictionary = new String[]{"wood", "joke", "moat"};
        List<String> answer = solution.twoEditWords(queries, dictionary);
        Assertions.assertThat(answer).containsExactly("word", "note", "wood");
    }

    @Test
    void twoEditWords2() {
        String[] queries = new String[]{"yes"};
        String[] dictionary = new String[]{"not"};
        List<String> answer = solution.twoEditWords(queries, dictionary);
        Assertions.assertThat(answer).isEmpty();
    }

}