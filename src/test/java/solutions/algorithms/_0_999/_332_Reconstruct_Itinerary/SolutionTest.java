package solutions.algorithms._0_999._332_Reconstruct_Itinerary;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findItinerary1() {
        List<List<String>> tickets = List.of(
                List.of("MUC", "LHR"),
                List.of("JFK", "MUC"),
                List.of("SFO", "SJC"),
                List.of("LHR", "SFO")
        );

        List<String> answer = solution.findItinerary(tickets);

        Assertions.assertThat(answer).containsExactly("JFK", "MUC", "LHR", "SFO", "SJC");
    }

    @Test
    void findItinerary2() {
        List<List<String>> tickets = List.of(
                List.of("JFK", "SFO"),
                List.of("JFK", "ATL"),
                List.of("SFO", "ATL"),
                List.of("ATL", "JFK"),
                List.of("ATL", "SFO")
        );

        List<String> answer = solution.findItinerary(tickets);

        Assertions.assertThat(answer).containsExactly("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
    }
}