package solutions.algorithms._3000_3999._3620_Network_Recovery_Pathways;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaxPathScore1() {
        int[][] edges = new int[][]{{0, 1, 5}, {1, 3, 10}, {0, 2, 3}, {2, 3, 4}};
        boolean[] online = new boolean[]{true, true, true, true};
        int k = 10;
        int answer = solution.findMaxPathScore(edges, online, k);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void findMaxPathScore2() {
        int[][] edges = new int[][]{{0, 1, 7}, {1, 4, 5}, {0, 2, 6}, {2, 3, 6}, {3, 4, 2}, {2, 4, 6}};
        boolean[] online = new boolean[]{true, true, true, false, true};
        int k = 12;
        int answer = solution.findMaxPathScore(edges, online, k);
        Assertions.assertThat(answer).isEqualTo(6);
    }
}