package solutions.algorithms._0_999._799_Champagne_Tower;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void champagneTower1() {
        int poured = 1;
        int query_row = 1;
        int query_glass = 1;
        double answer = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertThat(answer).isEqualTo(0.00000, Offset.offset(1e-5));
    }

    @Test
    void champagneTower2() {
        int poured = 2;
        int query_row = 1;
        int query_glass = 1;
        double answer = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertThat(answer).isEqualTo(0.50000, Offset.offset(1e-5));
    }

    @Test
    void champagneTower3() {
        int poured = 100000009;
        int query_row = 33;
        int query_glass = 17;
        double answer = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertThat(answer).isEqualTo(1.00000, Offset.offset(1e-5));
    }

    @Test
    void champagneTower4() {
        int poured = 4;
        int query_row = 2;
        int query_glass = 1;
        double answer = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertThat(answer).isEqualTo(0.50000, Offset.offset(1e-5));
    }
}