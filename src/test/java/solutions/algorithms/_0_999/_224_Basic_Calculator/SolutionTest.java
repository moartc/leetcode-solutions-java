package solutions.algorithms._0_999._224_Basic_Calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calculate1() {
        String s = "1 + 1";
        int res = solution.calculate(s);
        Assertions.assertThat(res).isEqualTo(2);
    }

    @Test
    void calculate2() {
        String s = " 2-1 + 2 ";
        int res = solution.calculate(s);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void calculate3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int res = solution.calculate(s);
        Assertions.assertThat(res).isEqualTo(23);
    }

    @Test
    void calculate4() {
        String s = "2147483647";
        int res = solution.calculate(s);
        Assertions.assertThat(res).isEqualTo(2147483647);
    }

    @Test
    void calculate5() {
        String s = "11+22-11";
        int res = solution.calculate(s);
        Assertions.assertThat(res).isEqualTo(22);
    }

    @Test
    void calculate6() {
        String s = "- (3 + (4 + 5))";
        int res = solution.calculate(s);
        Assertions.assertThat(res).isEqualTo(-12);
    }

}


