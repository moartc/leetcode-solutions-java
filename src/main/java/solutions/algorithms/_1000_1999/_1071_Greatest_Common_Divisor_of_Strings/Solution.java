package solutions.algorithms._1000_1999._1071_Greatest_Common_Divisor_of_Strings;

class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
        int div = gcd(str1.length(), str2.length());
        while (div >= 1) {
            if (str1.length() % div == 0 && str2.length() % div == 0) {
                if (canDivide(str1, str2, div) && canDivide(str2, str2, div)) {
                    return str1.substring(0, div);
                }
            }
            div--;
        }
        return "";
    }

    private boolean canDivide(String s, String div, int commDiv) {
        var divIdx = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) != div.charAt(divIdx)) {
                return false;
            }
            divIdx++;
            if (divIdx == commDiv) {
                divIdx = 0;
            }
        }
        return true;
    }
}
