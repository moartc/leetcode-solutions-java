package solutions.algorithms._0_999._49_Group_Anagrams;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {

        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> actual = solution.groupAnagrams(strings);

        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("bat"));
        expected.add(List.of("nat", "tan"));
        expected.add(List.of("ate", "eat", "tea"));

        // I need to convert it to set because the order is quite random
        Set<Set<String>> expectedSets = new HashSet<>();
        for (List<String> list : expected) {
            expectedSets.add(new HashSet<>(list));
        }

        Set<Set<String>> actualSets = new HashSet<>();
        for (List<String> list : actual) {
            actualSets.add(new HashSet<>(list));
        }

        Assertions.assertThat(actualSets).isEqualTo(expectedSets);
    }

}