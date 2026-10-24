package solutions.algorithms._2000_2999._2409_Count_Days_Spent_Together;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countDaysTogether1() {
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
        int answer = solution.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void countDaysTogether2() {
        String arriveAlice = "10-01";
        String leaveAlice = "10-31";
        String arriveBob = "11-01";
        String leaveBob = "12-31";
        int answer = solution.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}