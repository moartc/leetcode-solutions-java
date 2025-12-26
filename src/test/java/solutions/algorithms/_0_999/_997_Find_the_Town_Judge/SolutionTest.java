package solutions.algorithms._0_999._997_Find_the_Town_Judge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findJudge1() {
        int n = 2;
        int[][] trust = new int[][]{{1, 2}};
        int answer = solution.findJudge(n, trust);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findJudge2() {
        int n = 3;
        int[][] trust = new int[][]{{1, 3}, {2, 3}};
        int answer = solution.findJudge(n, trust);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void findJudge3() {
        int n = 3;
        int[][] trust = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        int answer = solution.findJudge(n, trust);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}