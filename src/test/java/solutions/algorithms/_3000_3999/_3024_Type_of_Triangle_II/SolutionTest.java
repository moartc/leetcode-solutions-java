package solutions.algorithms._3000_3999._3024_Type_of_Triangle_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void triangleTypeTest1() {
        String s = solution.triangleType(new int[]{3, 4, 5});
        Assertions.assertThat(s).isEqualTo("scalene");
    }

    @Test
    void triangleTypeTest2() {
        String s = solution.triangleType(new int[]{3, 3, 3});
        Assertions.assertThat(s).isEqualTo("equilateral");

    }

    @Test
    void triangleTypeTest3() {
        String s = solution.triangleType(new int[]{8, 4, 2});
        Assertions.assertThat(s).isEqualTo("none");
    }
}