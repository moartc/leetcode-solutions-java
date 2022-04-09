package solutions.utils;

import commons.Node;

import java.util.LinkedList;
import java.util.List;

public class NodeUtils {

    public static List<Integer> nodeAsList(Node node) {
        LinkedList<Integer> toReturn = new LinkedList<>();
        int height = height(node);
        for (int i = 1; i <= height; i++) {
            collectLevel(node, i, toReturn);
        }
        while (toReturn.getLast() == null) {
            toReturn.removeLast();
        }
        return toReturn;
    }

    private static void collectLevel(Node node, int level, List<Integer> list) {
        if (node == null) {
            list.add(null);
            return;
        }
        if (level == 1) {
            list.add(node.val);
        } else if (level > 1) {
            collectLevel(node.left, level - 1, list);
            collectLevel(node.right, level - 1, list);
        }
    }

    private static int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

