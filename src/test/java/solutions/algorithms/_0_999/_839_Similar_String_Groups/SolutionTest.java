package solutions.algorithms._0_999._839_Similar_String_Groups;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSimilarGroups1() {
        String[] strs = new String[]{"tars", "rats", "arts", "star"};
        int answer = solution.numSimilarGroups(strs);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void numSimilarGroups2() {
        String[] strs = new String[]{"omv", "ovm"};
        int answer = solution.numSimilarGroups(strs);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}