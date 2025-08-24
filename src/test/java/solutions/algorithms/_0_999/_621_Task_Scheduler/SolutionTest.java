package solutions.algorithms._0_999._621_Task_Scheduler;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {

        char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        int answer = solution.leastInterval(tasks, n);

        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void test2() {

        char[] tasks = new char[]{'A', 'C', 'A', 'B', 'D', 'B'};
        int n = 1;

        int answer = solution.leastInterval(tasks, n);

        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void test3() {

        char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 3;

        int answer = solution.leastInterval(tasks, n);

        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void test4() {

        // from my doc
        char[] tasks = new char[]{
                'A', 'A', 'A', 'A', 'A',
                'B', 'B', 'B', 'B', 'B',
                'C', 'C', 'C',
                'D', 'D',
                'E',
                'F'
        };
        int n = 4;

        int answer = solution.leastInterval(tasks, n);

        Assertions.assertThat(answer).isEqualTo(22);
    }
}