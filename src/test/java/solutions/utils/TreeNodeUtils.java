package solutions.utils;

import commons.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class TreeNodeUtils {

    public static List<Integer> treeNodeAsList(TreeNode treeNode) {
        LinkedList<Integer> toReturn = new LinkedList<>();
        int h = height(treeNode);
        for (int i = 1; i <= h; i++) {
            collectLevel(treeNode, i, toReturn);
        }
        while(toReturn.getLast() == null) {
            toReturn.removeLast();
        }
        return toReturn;
    }

    private static void collectLevel(TreeNode treeNode, int level, List<Integer> list) {
        if (treeNode == null) {
            list.add(null);
            return;
        }
        if (level == 1) {
            list.add(treeNode.val);
        } else if (level > 1) {
            collectLevel(treeNode.left, level - 1, list);
            collectLevel(treeNode.right, level - 1, list);
        }
    }

    private static int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            int leftHeight = height(treeNode.left);
            int rightHeight = height(treeNode.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

