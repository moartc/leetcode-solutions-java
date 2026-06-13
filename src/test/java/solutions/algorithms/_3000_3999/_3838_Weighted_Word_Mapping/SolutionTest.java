package solutions.algorithms._3000_3999._3838_Weighted_Word_Mapping;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mapWordWeights1() {
        String[] words = new String[]{"abcd", "def", "xyz"};
        int[] weights = new int[]{5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};
        String answer = solution.mapWordWeights(words, weights);
        Assertions.assertThat(answer).isEqualTo("rij");
    }

    @Test
    void mapWordWeights2() {
        String[] words = new String[]{"a", "b", "c"};
        int[] weights = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        String answer = solution.mapWordWeights(words, weights);
        Assertions.assertThat(answer).isEqualTo("yyy");
    }

    @Test
    void mapWordWeights3() {
        String[] words = new String[]{"abcd"};
        int[] weights = new int[]{7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5};
        String answer = solution.mapWordWeights(words, weights);
        Assertions.assertThat(answer).isEqualTo("g");
    }
}