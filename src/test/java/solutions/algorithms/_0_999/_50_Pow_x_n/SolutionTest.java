package solutions.algorithms._0_999._50_Pow_x_n;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void myPow1() {
        double x = 2.00000;
        int n = 10;
        double answer = solution.myPow(x, n);
        Assertions.assertThat(answer).isEqualTo(1024.00000);
    }

    @Test
    void myPow2() {
        double x = 2.10000;
        int n = 3;
        double answer = solution.myPow(x, n);
        Assertions.assertThat(answer).isEqualTo(9.26100, Offset.offset(0.00001));
    }

    @Test
    void myPow3() {
        double x = 2.00000;
        int n = -2;
        double answer = solution.myPow(x, n);
        Assertions.assertThat(answer).isEqualTo(0.25000);
    }

    @Test
    void myPow4() {
        double x = 2.00000;
        int n = -2147483648;
        double answer = solution.myPow(x, n);
        Assertions.assertThat(answer).isEqualTo(0.0);
    }

    @Test
    void myPow5() {
        double x = 8.95371;
        int n = -1;
        double answer = solution.myPow(x, n);
        Assertions.assertThat(answer).isEqualTo(0.11169, Offset.offset(0.00001));
    }
}