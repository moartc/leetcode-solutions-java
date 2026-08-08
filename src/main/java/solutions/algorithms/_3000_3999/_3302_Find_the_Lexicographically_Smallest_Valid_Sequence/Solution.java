package solutions.algorithms._3000_3999._3302_Find_the_Lexicographically_Smallest_Valid_Sequence;

class Solution {

    public int[] validSequence(String word1, String word2) {

        int[] suffixMatch = new int[word1.length() + 1];
        suffixMatch[word1.length()] = 0;
        char[] arr2 = word2.toCharArray();
        char[] arr1 = word1.toCharArray();

        int p2 = arr2.length - 1;
        int p1 = arr1.length - 1;
        while (p1 >= 0) {
            if (p2 >= 0 && arr2[p2] == arr1[p1]) {
                suffixMatch[p1] = suffixMatch[p1 + 1] + 1;
                p2--;
            } else {
                suffixMatch[p1] = suffixMatch[p1 + 1];
            }
            p1--;
        }

        int[] answer = new int[arr2.length];
        boolean isResult = match2(arr1, arr2, suffixMatch, false, answer);
        if (!isResult) {
            return new int[]{};
        } else {
            return answer;
        }
    }

    boolean match2(char[] arr1, char[] arr2, int[] suffixMatch, boolean replaceUsed, int[] answer) {
        int i2 = 0;
        for (int i1 = 0; i1 < arr1.length; i1++) {
            if (i2 == arr2.length) {
                return true;
            }
            if (arr1[i1] == arr2[i2]) { // char match
                answer[i2] = i1;
                i2++;
            } else if (!replaceUsed && suffixMatch[i1 + 1] >= arr2.length - i2 - 1) {
                answer[i2] = i1;
                i2++;
                replaceUsed = true;
            } else {
                // nothing
            }
        }
        if (i2 <= arr2.length - 1) {
            return false;
        } else {
            return true;
        }
    }
}