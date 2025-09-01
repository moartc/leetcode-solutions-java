package solutions.algorithms._0_999._763_Partition_Labels;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void partitionLabels1() {

        String s = "ababcbacadefegdehijhklij";
        List<Integer> answer = solution.partitionLabels(s);
        Assertions.assertThat(answer).containsExactly(9, 7, 8);
    }

    @Test
    void partitionLabels2() {

        String s = "eccbbbbdec";
        List<Integer> answer = solution.partitionLabels(s);
        Assertions.assertThat(answer).containsExactly(10);
    }
}