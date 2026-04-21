package solutions.algorithms._1000_1999._1722_Minimize_Hamming_Distance_After_Swap_Operations;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumHammingDistance1() {
        int[] source = new int[]{1, 2, 3, 4};
        int[] target = new int[]{2, 1, 4, 5};
        int[][] allowedSwaps = new int[][]{{0, 1}, {2, 3}};
        int answer = solution.minimumHammingDistance(source, target, allowedSwaps);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minimumHammingDistance2() {
        int[] source = new int[]{1, 2, 3, 4};
        int[] target = new int[]{1, 3, 2, 4};
        int[][] allowedSwaps = new int[][]{};
        int answer = solution.minimumHammingDistance(source, target, allowedSwaps);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minimumHammingDistance3() {
        int[] source = new int[]{5, 1, 2, 4, 3};
        int[] target = new int[]{1, 5, 4, 2, 3};
        int[][] allowedSwaps = new int[][]{{0, 4}, {4, 2}, {1, 3}, {1, 4}};
        int answer = solution.minimumHammingDistance(source, target, allowedSwaps);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minimumHammingDistance4() {
        int[] source = new int[]{50, 46, 54, 35, 18, 42, 26, 72, 75, 47, 50, 4, 54, 21, 18, 18, 61, 64, 100, 14};
        int[] target = new int[]{83, 34, 43, 73, 61, 94, 10, 68, 74, 31, 54, 46, 28, 60, 18, 18, 4, 44, 79, 92};
        int[][] allowedSwaps = new int[][]{{1, 8}, {14, 17}, {3, 1}, {17, 10}, {18, 2}, {7, 12}, {11, 3}, {1, 15}, {13, 17}, {18, 19}, {0, 10}, {15, 19}, {0, 15}, {6, 7}, {7, 15}, {19, 4}, {7, 16}, {14, 18}, {8, 10}, {17, 0}, {2, 13}, {14, 10}, {12, 17}, {2, 9}, {6, 15}, {16, 18}, {2, 16}, {2, 6}, {4, 5}, {17, 5}, {10, 13}, {7, 2}, {9, 16}, {15, 5}, {0, 5}, {8, 0}, {11, 12}, {9, 7}, {1, 0}, {11, 17}, {4, 6}, {5, 7}, {19, 12}, {3, 18}, {19, 1}, {13, 18}, {19, 6}, {13, 6}, {6, 1}, {4, 2}};
        int answer = solution.minimumHammingDistance(source, target, allowedSwaps);
        Assertions.assertThat(answer).isEqualTo(14);
    }

    @Test
    void minimumHammingDistance5() {
        int[] source = new int[]{2, 3, 1};
        int[] target = new int[]{1, 2, 2};
        int[][] allowedSwaps = new int[][]{{0, 2}, {1, 2}};
        int answer = solution.minimumHammingDistance(source, target, allowedSwaps);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}