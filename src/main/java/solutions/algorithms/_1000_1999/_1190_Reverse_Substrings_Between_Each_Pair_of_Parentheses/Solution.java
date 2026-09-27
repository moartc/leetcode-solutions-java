package solutions.algorithms._1000_1999._1190_Reverse_Substrings_Between_Each_Pair_of_Parentheses;

class Solution {
    public String reverseParentheses(String s) {

        char[] chars = s.toCharArray();
        return parse(chars, 0).word.toString();
    }

    WordAndIndex parse(char[] arr, int startIdx) {

        StringBuilder sb = new StringBuilder();
        for (int i = startIdx; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(') {
                WordAndIndex nextWord = parse(arr, i + 1);
                String strToAppend = nextWord.word.reverse().toString();
                sb.append(strToAppend);
                i = nextWord.index;
            } else if (c == ')') {
                return new WordAndIndex(sb, i);
            } else {
                // char
                sb.append(c);
            }
        }
        return new WordAndIndex(sb, arr.length);

    }

    static class WordAndIndex {
        StringBuilder word;
        int index;

        public WordAndIndex(StringBuilder word, int index) {
            this.word = word;
            this.index = index;
        }
    }
}