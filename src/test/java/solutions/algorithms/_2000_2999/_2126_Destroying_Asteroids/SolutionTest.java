package solutions.algorithms._2000_2999._2126_Destroying_Asteroids;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void asteroidsDestroyed1() {
        int mass = 10;
        int[] asteroids = new int[]{3, 9, 19, 5, 21};
        boolean answer = solution.asteroidsDestroyed(mass, asteroids);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void asteroidsDestroyed2() {
        int mass = 5;
        int[] asteroids = new int[]{4, 9, 23, 4};
        boolean answer = solution.asteroidsDestroyed(mass, asteroids);
        Assertions.assertThat(answer).isFalse();
    }
}