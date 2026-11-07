package solutions.algorithms._1000_1999._1882_Process_Tasks_Using_Servers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void assignTasks1() {
        int[] servers = new int[]{3, 3, 2};
        int[] tasks = new int[]{1, 2, 3, 2, 1, 2};
        int[] answer = solution.assignTasks(servers, tasks);
        Assertions.assertThat(answer).containsExactly(2, 2, 0, 2, 1, 2);
    }

    @Test
    void assignTasks2() {
        int[] servers = new int[]{5, 1, 4, 3, 2};
        int[] tasks = new int[]{2, 1, 2, 4, 5, 2, 1};
        int[] answer = solution.assignTasks(servers, tasks);
        Assertions.assertThat(answer).containsExactly(1, 4, 1, 4, 1, 3, 2);
    }

    @Test
    void assignTasks3() {
        int[] servers = new int[]{10, 63, 95, 16, 85, 57, 83, 95, 6, 29, 71};
        int[] tasks = new int[]{70, 31, 83, 15, 32, 67, 98, 65, 56, 48, 38, 90, 5};
        int[] answer = solution.assignTasks(servers, tasks);
        Assertions.assertThat(answer).containsExactly(8, 0, 3, 9, 5, 1, 10, 6, 4, 2, 7, 9, 0);
    }
}