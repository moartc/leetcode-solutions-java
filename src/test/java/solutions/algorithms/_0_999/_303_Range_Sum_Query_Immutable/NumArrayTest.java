package solutions.algorithms._0_999._303_Range_Sum_Query_Immutable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumArrayTest {

    @Test
    void sumRange1() {
        NumArray n = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int a1 = n.sumRange(0, 2);
        int a2 = n.sumRange(2, 5);
        int a3 = n.sumRange(0, 5);
        Assertions.assertThat(a1).isEqualTo(1);
        Assertions.assertThat(a2).isEqualTo(-1);
        Assertions.assertThat(a3).isEqualTo(-3);
    }
}