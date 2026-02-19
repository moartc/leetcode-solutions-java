package solutions.algorithms._0_999._696_Count_Binary_Substrings;

class Solution {

    /*
    kinda bruteforce solution would be to start with 2 indices 0 and 1 and move forward toward the end of the string O(n),
    at each pair of indices, I check if the chars are different, if so, I add the substring to a set (this can probably be improved
    and I could store it as a list (or rather map) of int arrays <first int, length>)
    after that I expand outwards moving the left and right indices. the next left should match the previous left and the next right
    should match the previous right.

    update: I don't need any set or even arrays. I can just increase the counter.
    and with using char array instead of get on the string it beats 96.04%
     */

    public int countBinarySubstrings(String s) {

        // instead of map
        char[] charArray = s.toCharArray();
        int ctr = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            char c1 = charArray[i];
            char c2 = charArray[i + 1];
            if (c1 != c2) {
                int left = i;
                int right = i + 1;
                ctr++;
                while (left - 1 >= 0 && right + 1 < charArray.length) {
                    left--;
                    right++;
                    if (c1 == charArray[left] && c2 == charArray[right]) {
                        ctr++;
                    } else {
                        break;
                    }
                }
            }
        }
        return ctr;
    }

}