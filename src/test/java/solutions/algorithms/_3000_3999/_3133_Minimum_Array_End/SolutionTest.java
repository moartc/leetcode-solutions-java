package solutions.algorithms._3000_3999._3133_Minimum_Array_End;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minEnd1() {
        int n = 3;
        int x = 4;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void minEnd2() {
        int n = 2;
        int x = 7;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(15);
    }

    @Test
    void minEnd3() {
        int n = 2;
        int x = 2;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minEnd4() {
        int n = 3;
        int x = 2;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void minEnd5() {
        int n = 3;
        int x = 1;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void minEnd6() {
        int n = 4;
        int x = 2;
        //x=2=10
        //n=4=1
        //diff=2=10

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void minEnd7() {
        int n = 1;
        int x = 1;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minEnd8() {
        int n = 6715154;
        int x = 7193485;

        long answer = solution.minEnd(n, x);

        Assertions.assertThat(answer).isEqualTo(55012476815L);
    }
}