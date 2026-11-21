package solutions.algorithms._3000_3999._3331_Find_Subtree_Sizes_After_Changes;

import java.util.*;

class Solution {

    int[] newParents;

    public int[] findSubtreeSizes(int[] parent, String s) {


        Map<Integer, List<Integer>> nodeToChildren = new HashMap();
        for (int i = 0; i < parent.length; i++) {
            nodeToChildren.put(i, new ArrayList<>());
        }
        for (int i = 0; i < parent.length; i++) {
            int p = parent[i];
            if (p != -1) {
                List<Integer> currChildren = nodeToChildren.get(p);
                currChildren.add(i);
                nodeToChildren.put(p, currChildren);
            }
        }

        int[] lastNodeWithChar = new int[26];
        Arrays.fill(lastNodeWithChar, -1);

        newParents = new int[parent.length];
        for (int i = 0; i < parent.length; i++) {
            newParents[i] = parent[i];
        }
        dfs(0, nodeToChildren, lastNodeWithChar, s);

        Map<Integer, List<Integer>> newNodeToChildren = new HashMap<>();
        for (int node = 0; node < newParents.length; node++) {
            int nodeParent = newParents[node];
            if (nodeParent != -1) {
                List<Integer> list = newNodeToChildren.getOrDefault(nodeParent, new ArrayList<>());
                list.add(node);
                newNodeToChildren.put(nodeParent, list);
            }
        }

        int[] answer = new int[parent.length];
        countSubtreeSize(0, newNodeToChildren, answer);
        return answer;
    }

    int countSubtreeSize(int node, Map<Integer, List<Integer>> nodeToChildren, int[] answer) {
        int counter = 1;
        List<Integer> children = nodeToChildren.get(node);
        if (children != null) {
            for (Integer child : children) {
                counter += countSubtreeSize(child, nodeToChildren, answer);
            }
        }
        answer[node] = counter;
        return counter;
    }

    void dfs(int node, Map<Integer, List<Integer>> nodeToChildren, int[] lastNodeWithChar, String s) {

        char currentChar = s.charAt(node);
        int charIdx = currentChar - 'a';
        if (lastNodeWithChar[charIdx] != -1) {
            // set new Idx
            newParents[node] = lastNodeWithChar[charIdx];
        }
        for (Integer nodeToVisit : nodeToChildren.get(node)) {
            int previousNOde = lastNodeWithChar[charIdx];
            lastNodeWithChar[charIdx] = node;
            dfs(nodeToVisit, nodeToChildren, lastNodeWithChar, s);
            // and remove
            lastNodeWithChar[charIdx] = previousNOde;
        }
    }
}