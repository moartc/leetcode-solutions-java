package solutions.algorithms._2000_2999._2911_Minimum_Changes_to_Make_K_Semi_palindromes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumChanges1() {
        String s = "abcac";
        int k = 2;
        int answer = solution.minimumChanges(s, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minimumChanges2() {
        String s = "abcdef";
        int k = 2;
        int answer = solution.minimumChanges(s, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minimumChanges3() {
        String s = "aabbaa";
        int k = 3;
        int answer = solution.minimumChanges(s, k);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minimumChanges4() {
        String s = "acba";
        int k = 2;
        int answer = solution.minimumChanges(s, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}