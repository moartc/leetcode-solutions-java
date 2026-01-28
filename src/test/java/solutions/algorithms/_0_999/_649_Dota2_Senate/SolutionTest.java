package solutions.algorithms._0_999._649_Dota2_Senate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void predictPartyVictory1() {
        String senate = "RD";
        String answer = solution.predictPartyVictory(senate);
        Assertions.assertThat(answer).isEqualTo("Radiant");
    }

    @Test
    void predictPartyVictory2() {
        String senate = "RDD";
        String answer = solution.predictPartyVictory(senate);
        Assertions.assertThat(answer).isEqualTo("Dire");
    }

    @Test
    void predictPartyVictory3() {
        String senate = "DRRDRDRDRDDRDRDR";
        // DXRXRXRXRXDXDXDX
        String answer = solution.predictPartyVictory(senate);
        Assertions.assertThat(answer).isEqualTo("Radiant");
    }

}