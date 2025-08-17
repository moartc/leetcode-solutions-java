package solutions.algorithms._1000_1999._1448_Count_Good_Nodes_in_Binary_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void goodNodesTest1() {

        TreeNode root = new TreeNode(3, new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5)));

        int answer = solution.goodNodes(root);

        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void goodNodesTest2() {

        TreeNode root = new TreeNode(3, new TreeNode(3, new TreeNode(4), new TreeNode(2)), null);

        int answer = solution.goodNodes(root);

        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void goodNodesTest3() {

        TreeNode root = new TreeNode(1);

        int answer = solution.goodNodes(root);

        Assertions.assertThat(answer).isEqualTo(1);
    }
}