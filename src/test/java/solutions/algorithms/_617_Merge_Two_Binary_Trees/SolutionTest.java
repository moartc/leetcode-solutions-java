package solutions.algorithms._617_Merge_Two_Binary_Trees;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.utils.TreeNodeUtils;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeTreesTest1() {
        TreeNode left3 = new TreeNode(3, new TreeNode(5), null);
        TreeNode root1 = new TreeNode(1, left3, new TreeNode(2));

        TreeNode left1 = new TreeNode(1, null, new TreeNode(4));
        TreeNode right3 = new TreeNode(3, null, new TreeNode(7));
        TreeNode root2 = new TreeNode(2, left1, right3);

        TreeNode actual = solution.mergeTrees(root1, root2);
        List<Integer> expectedList = Arrays.asList(3, 4, 5, 5, 4, null, 7);
        Assertions.assertIterableEquals(expectedList, TreeNodeUtils.treeNodeAsList(actual));
    }

    @Test
    void mergeTreesTest2() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);

        TreeNode actual = solution.mergeTrees(root1, root2);
        List<Integer> expectedList = Arrays.asList(2, 2);
        Assertions.assertIterableEquals(expectedList, TreeNodeUtils.treeNodeAsList(actual));
    }
}
