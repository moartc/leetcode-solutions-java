package solutions.algorithms._1000_1999._1189_Maximum_Number_of_Balloons;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxNumberOfBalloons1() {
        String text = "nlaebolko";
        int answer = solution.maxNumberOfBalloons(text);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxNumberOfBalloons2() {
        String text = "loonbalxballpoon";
        int answer = solution.maxNumberOfBalloons(text);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxNumberOfBalloons3() {
        String text = "leetcode";
        int answer = solution.maxNumberOfBalloons(text);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maxNumberOfBalloons4() {
        String text = "nllbblooon";
        int answer = solution.maxNumberOfBalloons(text);
        Assertions.assertThat(answer).isEqualTo(0);
    }

}