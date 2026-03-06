package solutions.algorithms._1000_1999._1784_Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkOnesSegment1() {
        String s = "1001";
        boolean answer = solution.checkOnesSegment(s);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void checkOnesSegment2() {
        String s = "110";
        boolean answer = solution.checkOnesSegment(s);
        Assertions.assertThat(answer).isTrue();
    }
}