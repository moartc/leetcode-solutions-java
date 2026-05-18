package solutions.algorithms._0_999._944_Delete_Columns_to_Make_Sorted;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDeletionSize1() {
        String[] strs = new String[]{"cba", "daf", "ghi"};
        int answer = solution.minDeletionSize(strs);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minDeletionSize2() {
        String[] strs = new String[]{"a", "b"};
        int answer = solution.minDeletionSize(strs);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minDeletionSize3() {
        String[] strs = new String[]{"zyx", "wvu", "tsr"};
        int answer = solution.minDeletionSize(strs);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}