package solutions.algorithms._2000_2999._2904_Shortest_and_Lexicographically_Smallest_Beautiful_String;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        char[] cA = s.toCharArray();

        int l = 0;
        int r = -1;
        int ctr = 0;
        String bestFound = null;
        while (r < cA.length) {
            if (ctr >= k) {
                int charAtL = cA[l];
                if (charAtL == '1') {
                    ctr--;
                }
                l++;
            } else if (r + 1 < cA.length) {
                r++;
                char charAtR = cA[r];
                if (charAtR == '1') {
                    ctr++;
                }
            } else {
                break;
            }
            if (ctr == k) {
                if (isNewStringSmaller(l, r, cA, bestFound)) {
                    bestFound = s.substring(l, r + 1);
                }
            }
        }
        return bestFound != null ? bestFound : "";
    }

    private boolean isNewStringSmaller(int l, int r, char[] a, String found) {
        if (found == null) {
            return true;
        }
        if (found.length() < r - l + 1) {
            return false;
        } else if (found.length() > r - l + 1) {
            return true;
        } else { // equal size
            char[] foundCa = found.toCharArray();
            for (int i = 0; i < foundCa.length; i++) {
                int newC = a[l + i];
                int oldC = foundCa[i];
                if (newC < oldC) {
                    return true;
                } else if (oldC < newC) {
                    return false;
                } else {
                    // continue
                }
            }
        }
        // doesn't matter
        return false;
    }
}