package solutions.algorithms._1000_1999._1606_Find_Servers_That_Handled_Most_Number_of_Requests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void busiestServers1() {
        int k = 3;
        int[] arrival = new int[]{1, 2, 3, 4, 5};
        int[] loads = new int[]{5, 2, 3, 3, 3};
        List<Integer> answer = solution.busiestServers(k, arrival, loads);
        Assertions.assertThat(answer).containsExactly(1);
    }

    @Test
    void busiestServers2() {
        int k = 3;
        int[] arrival = new int[]{1, 2, 3, 4};
        int[] loads = new int[]{1, 2, 1, 2};
        List<Integer> answer = solution.busiestServers(k, arrival, loads);
        Assertions.assertThat(answer).containsExactly(0);
    }

    @Test
    void busiestServers3() {
        int k = 3;
        int[] arrival = new int[]{1, 2, 3};
        int[] loads = new int[]{10, 12, 11};
        List<Integer> answer = solution.busiestServers(k, arrival, loads);
        Assertions.assertThat(answer).containsExactly(0, 1, 2);
    }
}