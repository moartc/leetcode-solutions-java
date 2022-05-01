package solutions.algorithms._120_Triangle;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumTotalTest1() {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3,4),
                List.of(6,5,7),
                List.of(4,1,8,3)
        );
        Assertions.assertThat(solution.minimumTotal(triangle)).isEqualTo(11);
    }

    @Test
    void minimumTotalTest2() {
        List<List<Integer>> triangle = List.of(
                List.of(-10)
        );
        Assertions.assertThat(solution.minimumTotal(triangle)).isEqualTo(-10);
    }

    @Test
    void minimumTotalTest3() {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3,4),
                List.of(7,5,6),
                List.of(4,8,9,1)
        );
        Assertions.assertThat(solution.minimumTotal(triangle)).isEqualTo(13);
    }

    @Test
    void minimumTotalTest4() {
        List<List<Integer>> triangle = List.of(
                List.of(-1),
                List.of(2,3),
                List.of(1,-1,-3)
        );
        Assertions.assertThat(solution.minimumTotal(triangle)).isEqualTo(-1);
    }

    @Test
    void minimumTotalTest5() {
        List<List<Integer>> triangle = List.of(
                List.of(1),
                List.of(-5,-2),
                List.of(3,6,1),
                List.of(-1,2,4,-3)
        );
        Assertions.assertThat(solution.minimumTotal(triangle)).isEqualTo(-3);
    }
}