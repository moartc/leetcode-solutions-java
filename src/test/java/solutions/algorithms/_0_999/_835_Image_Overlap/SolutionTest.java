package solutions.algorithms._0_999._835_Image_Overlap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestOverlap1() {
        int[][] img1 = new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] img2 = new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
        int answer = solution.largestOverlap(img1, img2);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void largestOverlap2() {
        int[][] img1 = new int[][]{{1}};
        int[][] img2 = new int[][]{{1}};
        int answer = solution.largestOverlap(img1, img2);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void largestOverlap3() {
        int[][] img1 = new int[][]{{0}};
        int[][] img2 = new int[][]{{0}};
        int answer = solution.largestOverlap(img1, img2);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void largestOverlap4() {
        int[][] img1 = new int[][]{{0, 1}, {1, 1}};
        int[][] img2 = new int[][]{{1, 1}, {1, 0}};
        int answer = solution.largestOverlap(img1, img2);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}