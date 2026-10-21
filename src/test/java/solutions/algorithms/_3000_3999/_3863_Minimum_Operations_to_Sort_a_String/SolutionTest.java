package solutions.algorithms._3000_3999._3863_Minimum_Operations_to_Sort_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        String s = "dog";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minOperations2() {
        String s = "card";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minOperations3() {
        String s = "gf";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void minOperations4() {
        String s = "klo";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minOperations5() {
        String s = "jgg";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minOperations6() {
        String s = "omo";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

}