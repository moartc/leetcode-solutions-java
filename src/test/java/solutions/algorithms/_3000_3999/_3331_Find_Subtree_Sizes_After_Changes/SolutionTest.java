package solutions.algorithms._3000_3999._3331_Find_Subtree_Sizes_After_Changes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void findSubtreeSizes1() {
        int[] parent = new int[]{-1, 0, 0, 1, 1, 1};
        String s = "abaabc";
        int[] answer = solution.findSubtreeSizes(parent, s);
        Assertions.assertThat(answer).containsExactly(6, 3, 1, 1, 1, 1);
    }

    @Test
    void findSubtreeSizes2() {
        int[] parent = new int[]{-1, 0, 4, 0, 1};
        String s = "abbba";
        int[] answer = solution.findSubtreeSizes(parent, s);
        Assertions.assertThat(answer).containsExactly(5, 2, 1, 1, 1);
    }
}