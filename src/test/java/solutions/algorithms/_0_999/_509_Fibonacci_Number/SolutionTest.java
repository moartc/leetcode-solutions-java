package solutions.algorithms._0_999._509_Fibonacci_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fib1() {
        int n = 2;
        int answer = solution.fib(n);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void fib2() {
        int n = 3;
        int answer = solution.fib(n);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void fib3() {
        int n = 4;
        int answer = solution.fib(n);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}