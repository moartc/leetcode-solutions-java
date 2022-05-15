package solutions.algorithms._844_Backspace_String_Compare;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int ptr1 = s1.length - 1;
        int ptr2 = s2.length - 1;
        short back1 = 0;
        short back2 = 0;
        while (ptr1 >= 0 && ptr2 >= 0) {
            boolean shouldCompare = true;
            char c1 = s1[ptr1];
            char c2 = s2[ptr2];
            if (c1 == '#') {
                shouldCompare = false;
                back1++;
                ptr1--;
            } else if (back1 > 0) {
                shouldCompare = false;
                back1--;
                ptr1--;
            }
            if (c2 == '#') {
                shouldCompare = false;
                back2++;
                ptr2--;
            } else if (back2 > 0) {
                shouldCompare = false;
                back2--;
                ptr2--;
            }
            if (shouldCompare) {
                if (c1 != c2) {
                    return false;
                } else {
                    ptr1--;
                    ptr2--;
                }
            }
        }
        while (ptr1 >= 0) {
            char c1 = s1[ptr1];
            if (c1 == '#') {
                back1++;
                ptr1--;
            } else if (back1 > 0) {
                back1--;
                ptr1--;
            } else {
                return false;
            }
        }
        while (ptr2 >= 0) {
            char c2 = s2[ptr2];
            if (c2 == '#') {
                back2++;
                ptr2--;
            } else if (back2 > 0) {
                back2--;
                ptr2--;
            } else {
                return false;
            }
        }
        return true;
    }
}