package solutions.algorithms._0_999._8_String_to_Integer_atoi;

class Solution {

    public int myAtoi(String s) {
        // Long.MAX     == 9223372036854775807L = 19 digits
        // Integer.MAX  == 2147483647
        // Integer.MIN  == -2147483648
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            char c = sArr[i];
            if (c == '-' || c == '+') {
                if (i != 0) {
                    // incorrect
                    break;
                } else {
                    sb.append(c);
                }
            } else if (c == '0') {
                if (sb.isEmpty() || sb.charAt(sb.length() - 1) == '+' || sb.charAt(sb.length() - 1) == '-') {
                    // leading 0, skip
                } else {
                    sb.append(c);
                }
            } else if (c > '0' && c <= '9') {
                sb.append(c);
            } else {
                break;
            }
        }
        if (sb.length() > 11) { // approximation only, might be 10 char long and still doesn't fit in the integer range
            // should be rounded
            if (sb.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        } else {
            long answer = 0;
            long multi = 1;
            char[] charArray = sb.toString().toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                if (i == 0) {
                    if (charArray[i] == '-') {
                        answer *= -1;
                        break;
                    } else if (charArray[i] == '+') {
                        // do nothing but break
                        break;
                    }
                }
                int integer = charArray[i] - '0';
                answer += (integer * multi);
                multi *= 10;
            }
            if (answer < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (answer > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return (int) answer;
            }
        }
    }
}