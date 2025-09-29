package solutions.algorithms._0_999._97_Interleaving_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isInterleave1() {

        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean answer = solution.isInterleave(s1, s2, s3);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isInterleave2() {

        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean answer = solution.isInterleave(s1, s2, s3);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isInterleave3() {

        String s1 = "";
        String s2 = "";
        String s3 = "";
        boolean answer = solution.isInterleave(s1, s2, s3);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isInterleave4() {

        String s1 = "";
        String s2 = "b";
        String s3 = "b";
        boolean answer = solution.isInterleave(s1, s2, s3);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isInterleave5() {

        String s1 = "a";
        String s2 = "";
        String s3 = "c";
        boolean answer = solution.isInterleave(s1, s2, s3);
        Assertions.assertThat(answer).isFalse();
    }
}