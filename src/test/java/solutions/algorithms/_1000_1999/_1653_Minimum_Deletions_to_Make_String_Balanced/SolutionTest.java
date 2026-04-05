package solutions.algorithms._1000_1999._1653_Minimum_Deletions_to_Make_String_Balanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumDeletions1() {
        String s = "aababbab";
        int answer = solution.minimumDeletions(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minimumDeletions2() {
        String s = "bbaaaaabb";
        int answer = solution.minimumDeletions(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}