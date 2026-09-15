package solutions.algorithms._2000_2999._2472_Maximum_Number_of_Non_overlapping_Palindrome_Substrings;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    first find palindromes -> store them as a list of left right, then find non-overlapping ranges
     */

    int[] best;

    public int maxPalindromes(String s, int k) {


        if (k == 1) {
            return s.length();
        }
        char[] charArray = s.toCharArray();
        List<int[]> allPalindromes = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            allPalindromes.addAll(findPalindrome(charArray, i, k));
        }

        if (allPalindromes.isEmpty()) {
            return 0;
        }

        allPalindromes.sort((o1, o2) -> o1[0] - o2[0]);
        best = new int[allPalindromes.size()];

        return findTheAnswer(allPalindromes, 0);
    }

    int findTheAnswer(List<int[]> allPalindromes, int curr) {

        if (best[curr] != 0) {
            return best[curr];
        }
        int currR = allPalindromes.get(curr)[1];
        int bestFromHere = 0;
        for (int i = curr + 1; i < allPalindromes.size(); i++) {
            if (allPalindromes.get(i)[0] > currR) {
                bestFromHere = Math.max(bestFromHere, findTheAnswer(allPalindromes, i));
            }
        }
        best[curr] = 1 + bestFromHere;
        return best[curr];
    }


    List<int[]> findPalindrome(char[] arr, int start, int minSize) {

        List<int[]> res = new ArrayList<>();
        // middle start case
        int size1 = 1;
        int l = start - 1;
        int r = start + 1;
        while (l >= 0 && r < arr.length && arr[l] == arr[r]) {
            size1 += 2;
            if (size1 >= minSize) {
                res.add(new int[]{l, r});
                break;
            }
            l--;
            r++;
        }


        // left start case
        l = start;
        r = start + 1;
        size1 = 0;
        while (l >= 0 && r < arr.length && arr[l] == arr[r]) {
            size1 += 2;
            if (size1 >= minSize) {
                res.add(new int[]{l, r});
                break;
            }
            l--;
            r++;
        }
        return res;
    }
}