package solutions.algorithms._3000_3999._3568_Minimum_Moves_to_Clean_the_Classroom;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMoves1() {

        String[] classroom = new String[]{"S.", "XL"};
        int energy = 2;
        int answer = solution.minMoves(classroom, energy);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minMoves2() {

        String[] classroom = new String[]{"LS", "RL"};
        int energy = 4;
        int answer = solution.minMoves(classroom, energy);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minMoves3() {

        String[] classroom = new String[]{"L.S", "RXL"};
        int energy = 3;
        int answer = solution.minMoves(classroom, energy);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void minMoves4() {

        String[] classroom = new String[]{"SR"};
        int energy = 3;
        int answer = solution.minMoves(classroom, energy);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}