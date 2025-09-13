package solutions.algorithms._0_999._133_Clone_Graph;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void cloneGraph1() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.neighbors = List.of(n2, n4);
        n2.neighbors = List.of(n1, n3);
        n3.neighbors = List.of(n2, n4);
        n4.neighbors = List.of(n1, n3);

        Node node = solution.cloneGraph(n1);
        Assertions.assertThat(node.val).isEqualTo(1);
        Assertions.assertThat(node.neighbors.stream().map(n -> n.val).toList()).containsExactly(2, 4);
    }

    @Test
    void cloneGraph2() {
        Node n = new Node();
        Node node = solution.cloneGraph(n);
        Assertions.assertThat(node.neighbors).isEmpty();
    }

    @Test
    void cloneGraph3() {
        Node node = solution.cloneGraph(null);
        Assertions.assertThat(node).isNull();
    }
}