package solutions.algorithms._1000_1999._1861_Rotating_the_Box;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotateTheBox1() {
        char[][] boxGrid = new char[][]{{'#', '.', '#'}};
        char[][] answer = solution.rotateTheBox(boxGrid);
        Assertions.assertThat(answer[0]).containsExactly('.');
        Assertions.assertThat(answer[1]).containsExactly('#');
        Assertions.assertThat(answer[2]).containsExactly('#');
    }

    @Test
    void rotateTheBox2() {
        char[][] boxGrid = new char[][]{{'#', '.', '*', '.'}, {'#', '#', '*', '.'}};
        char[][] answer = solution.rotateTheBox(boxGrid);
        Assertions.assertThat(answer[0]).containsExactly('#', '.');
        Assertions.assertThat(answer[1]).containsExactly('#', '#');
        Assertions.assertThat(answer[2]).containsExactly('*', '*');
        Assertions.assertThat(answer[3]).containsExactly('.', '.');
    }

    @Test
    void rotateTheBox3() {
        char[][] boxGrid = new char[][]{
                {'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };
        char[][] answer = solution.rotateTheBox(boxGrid);
        Assertions.assertThat(answer[0]).containsExactly('.', '#', '#');
        Assertions.assertThat(answer[1]).containsExactly('.', '#', '#');
        Assertions.assertThat(answer[2]).containsExactly('#', '#', '*');
        Assertions.assertThat(answer[3]).containsExactly('#', '*', '.');
        Assertions.assertThat(answer[4]).containsExactly('#', '.', '*');
        Assertions.assertThat(answer[5]).containsExactly('#', '.', '.');
    }
}