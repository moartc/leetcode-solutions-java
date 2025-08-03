package solutions.algorithms._0_999._424_Longest_Repeating_Character_Replacement;

class Solution {
    public int characterReplacement(String s, int k) {

        if (s.isEmpty()) {
            return 0;
        }

        int[] map = new int[26];
        int i = 0;
        int j = 0;
        char[] charArray = s.toCharArray();
        int mostFrequent = 0;
        int maxFoundSolution = 0;

        while (j < charArray.length) {
            int currentCharIdx = charArray[j] - 'A';
            int currentNumberOfChar = map[currentCharIdx];
            int windowSize = j - i + 1;
            map[currentCharIdx] = currentNumberOfChar + 1;
            mostFrequent = Math.max(mostFrequent, currentNumberOfChar + 1);
            // check if the window is correct
            if (windowSize - mostFrequent <= k) {
                maxFoundSolution = Math.max(maxFoundSolution, j - i + 1);
            } else {
                int firstCharIdx = charArray[i] - 'A';
                int firstCharCounter = map[firstCharIdx];
                map[firstCharIdx] = firstCharCounter - 1;
                i++;
            }
            j++;
        }
        return maxFoundSolution;
    }
}

// A A B A B B B B B