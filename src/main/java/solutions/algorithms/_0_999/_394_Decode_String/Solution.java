package solutions.algorithms._0_999._394_Decode_String;

class Solution {

    /*
    I can recursively call a method and pass the beginning and end index,
    go deeper until there are no more braces, return the string then repeat it outside, and so on.
    update:
    I replaced String with char[]
    it beats 100%
     */
    public String decodeString(String s) {
        return decode(s.toCharArray(), 0, s.length() - 1);
    }

    // iterate over each string and handle the “first level”
    String decode(char[] s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            char c = s[i];
            if (c >= 'a' && c <= 'z') {
                sb.append(c);

            } else if (isCharDigit(c)) {
                // it's a digit so I have to encode it
                StringBuilder digitAsString = new StringBuilder();
                while (i < s.length && isCharDigit(s[i])) {
                    digitAsString.append(s[i]);
                    i++;
                }
                int numInt = Integer.parseInt(digitAsString.toString());
                // here I should have '[' so I want to find closing one
                int openingIdx = i;
                int opens = 0;
                while (i < s.length) {
                    if (s[i] == '[') {
                        opens++;
                    } else if (s[i] == ']') {
                        opens--;
                    }
                    if (opens == 0) {
                        break;
                    }
                    i++;
                }
                // here I am after break above and i points at closing ']'

                String decodedPart = decode(s, openingIdx + 1, i);
                for (int r = 0; r < numInt; r++) {
                    sb.append(decodedPart);
                }
            }
        }
        return sb.toString();
    }


    boolean isCharDigit(char c) {
        return c >= '0' && c <= '9';
    }
}