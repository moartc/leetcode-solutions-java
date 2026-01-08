package solutions.algorithms._0_999._399_Evaluate_Division;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calcEquation1() {
        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c")
        );
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x")
        );

        double[] answer = solution.calcEquation(equations, values, queries);

        Assertions.assertThat(answer).containsExactly(6.00000, 0.50000, -1.00000, 1.00000, -1.00000);
    }

    @Test
    void calcEquation2() {
        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c"),
                List.of("bc", "cd")
        );
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("c", "b"),
                List.of("bc", "cd"),
                List.of("cd", "bc")
        );
        double[] answer = solution.calcEquation(equations, values, queries);

        Assertions.assertThat(answer).containsExactly(3.75000, 0.40000, 5.00000, 0.20000);
    }

    @Test
    void calcEquation3() {
        List<List<String>> equations = List.of(
                List.of("a", "b")
        );
        double[] values = new double[]{0.5};
        List<List<String>> queries = List.of(
                List.of("a", "b"),
                List.of("b", "a"),
                List.of("a", "c"),
                List.of("x", "y")
        );

        double[] answer = solution.calcEquation(equations, values, queries);

        Assertions.assertThat(answer).containsExactly(0.50000, 2.00000, -1.00000, -1.00000);
    }

    @Test
    void calcEquation4() {
        List<List<String>> equations = List.of(
                List.of("x1", "x2"),
                List.of("x2", "x3"),
                List.of("x3", "x4"),
                List.of("x4", "x5")
        );
        double[] values = new double[]{3.0, 4.0, 5.0, 6.0};
        List<List<String>> queries = List.of(
                List.of("x1", "x5"),
                List.of("x5", "x2"),
                List.of("x2", "x4"),
                List.of("x2", "x2"),
                List.of("x2", "x9"),
                List.of("x9", "x9")
        );

        double[] answer = solution.calcEquation(equations, values, queries);
        double[] expected = new double[]{360.00000, 0.00833, 20.00000, 1.00000, -1.00000, -1.00000};

        Assertions.assertThat(answer).containsExactly(expected, Offset.offset(0.00001));
    }

}