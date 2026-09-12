package solutions.algorithms._3000_3999._3414_Maximum_Score_of_Non_overlapping_Intervals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumWeight1() {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(List.of(1, 3, 2));
        intervals.add(List.of(4, 5, 2));
        intervals.add(List.of(1, 5, 5));
        intervals.add(List.of(6, 9, 3));
        intervals.add(List.of(6, 7, 1));
        intervals.add(List.of(8, 9, 1));
        int[] answer = solution.maximumWeight(intervals);
        Assertions.assertThat(answer).containsExactly(2, 3);
    }

    @Test
    void maximumWeight2() {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(List.of(5, 8, 1));
        intervals.add(List.of(6, 7, 7));
        intervals.add(List.of(4, 7, 3));
        intervals.add(List.of(9, 10, 6));
        intervals.add(List.of(7, 8, 2));
        intervals.add(List.of(11, 14, 3));
        intervals.add(List.of(3, 5, 5));
        int[] answer = solution.maximumWeight(intervals);
        Assertions.assertThat(answer).containsExactly(1, 3, 5, 6);
    }

    @Test
    void maximumWeight3() {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(List.of(8, 15, 32));
        intervals.add(List.of(20, 21, 8));
        intervals.add(List.of(8, 16, 29));
        intervals.add(List.of(7, 12, 50));
        intervals.add(List.of(16, 25, 27));
        intervals.add(List.of(12, 17, 2));
        intervals.add(List.of(8, 12, 45));
        intervals.add(List.of(5, 10, 50));
        int[] answer = solution.maximumWeight(intervals);
        Assertions.assertThat(answer).containsExactly(3, 4);
    }

}