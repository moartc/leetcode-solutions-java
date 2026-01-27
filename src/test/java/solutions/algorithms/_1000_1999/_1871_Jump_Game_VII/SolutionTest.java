package solutions.algorithms._1000_1999._1871_Jump_Game_VII;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canReach1() {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;
        boolean answer = solution.canReach(s, minJump, maxJump);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canReach2() {
        String s = "01101110";
        int minJump = 2;
        int maxJump = 3;
        boolean answer = solution.canReach(s, minJump, maxJump);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canReach3() {
        String s = "00";
        int minJump = 1;
        int maxJump = 1;
        boolean answer = solution.canReach(s, minJump, maxJump);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canReach4() {
        String s = "00111010";
        int minJump = 3;
        int maxJump = 5;
        boolean answer = solution.canReach(s, minJump, maxJump);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canReach5() {
        StringBuilder sb = new StringBuilder(100000);
        for (int i = 0; i < 50000; i++) sb.append('0');
        for (int i = 0; i < 49999; i++) sb.append('1');
        sb.append('0');
        String s = sb.toString();
        int minJump = 1;
        int maxJump = 49999;
        boolean answer = solution.canReach(s, minJump, maxJump);
        Assertions.assertThat(answer).isFalse();
    }
}