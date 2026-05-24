package solutions.algorithms._1000_1999._1340_Jump_Game_V;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxJumps1() {
        int[] arr = new int[]{6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12};
        int d = 2;
        int answer = solution.maxJumps(arr, d);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxJumps2() {
        int[] arr = new int[]{3, 3, 3, 3, 3};
        int d = 3;
        int answer = solution.maxJumps(arr, d);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxJumps3() {
        int[] arr = new int[]{7, 6, 5, 4, 3, 2, 1};
        int d = 2;
        int answer = solution.maxJumps(arr, d);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void maxJumps4() {
        int[] arr = new int[]{1, 2, 3};
        int d = 1;
        int answer = solution.maxJumps(arr, d);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxJumps5() {
        int[] arr = new int[]{12, 90, 68, 50, 48, 41, 19, 83, 70, 80, 69, 48, 69, 55, 85, 61, 80, 19, 89, 11, 14, 15, 23, 93, 56, 30, 7, 32, 66, 71, 10, 86, 86, 60, 6, 14, 26, 3, 71, 86, 93, 40, 59, 85, 20, 83, 87, 85, 91, 26, 92, 93, 96, 29, 35, 49, 21, 91, 10, 1, 46, 63, 22, 97, 58, 59, 14, 61, 4, 72, 78, 58, 51, 45, 36, 5, 71, 48, 31, 93, 87, 48, 21, 69, 73, 93, 38, 62, 68, 93, 84, 67, 57, 86, 36, 70, 46, 1, 54, 38, 24, 73, 57, 42, 54, 13, 68, 36, 61, 84, 72, 36, 9, 57, 63, 17, 29, 48, 42, 78, 98, 36, 72, 51, 75, 92, 81, 40, 90, 80, 36, 73, 84, 1, 96, 60, 95, 99, 72, 58, 84, 64, 49, 65, 1, 35, 93, 79, 48, 45, 22, 81, 75, 49, 59, 71, 58, 38, 23, 14, 84, 78, 65, 60, 65, 85, 10, 37, 67, 84, 79, 34, 38, 16, 16, 41, 72, 30, 20, 44, 31, 43, 37, 90, 84, 5, 10, 59, 33, 88, 80, 25, 66, 61, 72, 31, 17, 94, 20, 52, 35, 37, 45, 20, 52, 78, 98, 2, 41, 23, 95, 86, 10, 64, 49, 13, 82, 93, 55, 13, 64, 93, 49, 88, 82, 47, 47, 60, 74, 93, 17, 29, 57, 62, 7, 71, 91, 61, 45, 90, 73, 36, 88, 84, 11, 36, 58, 38, 97, 80, 27, 61, 52, 85};
        int d = 64;
        int answer = solution.maxJumps(arr, d);
        Assertions.assertThat(answer).isEqualTo(14);
    }


}