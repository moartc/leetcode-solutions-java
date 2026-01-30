package solutions.algorithms._2000_2999._2402_Meeting_Rooms_III;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mostBooked1() {
        int n = 2;
        int[][] meetings = new int[][]{{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        int answer = solution.mostBooked(n, meetings);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void mostBooked2() {
        int n = 3;
        int[][] meetings = new int[][]{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        int answer = solution.mostBooked(n, meetings);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void mostBooked3() {
        int n = 4;
        int[][] meetings = new int[][]{{18, 19}, {3, 12}, {17, 19}, {2, 13}, {7, 10}};
        int answer = solution.mostBooked(n, meetings);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void mostBooked4() {
        // testcase I found in discussions, when I stuck at testcase 80
        int n = 2;
        int[][] meetings = new int[][]{{1, 10}, {2, 10}, {3, 10}, {4, 10}, {5, 10}, {6, 10}, {7, 10}};
        int answer = solution.mostBooked(n, meetings);
        Assertions.assertThat(answer).isEqualTo(0);
    }


}