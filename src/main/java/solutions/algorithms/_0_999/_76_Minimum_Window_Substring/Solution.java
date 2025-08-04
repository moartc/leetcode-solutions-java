package solutions.algorithms._0_999._76_Minimum_Window_Substring;

class Solution {
    public String minWindow(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        // create map of char to number of occurrences for t

        // store A...Z and a...z in an array
        // 26 x 2
        // for A  Z -> indices 0 ... 25
        // for a - z -> indices 26 ... 51
        int[] tMapArr = new int[52];
        for (char c : tArray) {
            int idx = getIdx(c);
            tMapArr[idx]++;
        }

        // create the sam map for s
        int[] sMapArr = new int[52];

        // left and right set at 0, move right until the end
        // when it's valid, move left until it's invalid
        // then move the whole window until it's valid again
        // and try to minimize window by moving left again
        int bestFoundSize = Integer.MAX_VALUE;
        int foundLeft = -1;
        int foundRight = -1;

        int left = 0;
        int right = 0;

        sMapArr[getIdx(sArray[0])]++;
        while (true) {

            if (isValid2(sMapArr, tMapArr)) {
                // check if that's the best result and store it
                int currentSize = right + 1 - left;
                if (bestFoundSize > currentSize) {
                    bestFoundSize = currentSize;
                    foundLeft = left;
                    foundRight = right;
                }
                // after update, move left
                char charAtLeft = sArray[left];
                sMapArr[getIdx(charAtLeft)]--;
                left++;
            } else {
                // it's not valid

                // if there was no result found -> try to move right
                if (bestFoundSize == Integer.MAX_VALUE) {
                    right++;
                    if (right < sArray.length) {
                        char charAtRight = sArray[right];
                        sMapArr[getIdx(charAtRight)]++;
                    } else {
                        // end, return what I have
                        return "";
                    }
                } else {
                    // there was found a result -> move the whole window
                    right++;
                    if (right < sArray.length) {
                        char charAtRight = sArray[right];
                        sMapArr[getIdx(charAtRight)]++;

                    } else {
                        // end, return what I have
                        return s.substring(foundLeft, foundRight + 1);
                    }
                    // and also move left
                    char charAtLeft = sArray[left];
                    sMapArr[getIdx(charAtLeft)]--;
                    left++;
                }
            }
        }
    }

    int getIdx(char c) {
        int idx;
        if (c > 'Z') {
            // smaller case
            idx = c - 'a' + 26;
        } else {
            idx = c - 'A';
        }
        return idx;
    }

    boolean isValid2(int[] sM, int[] tM) {
        for (int i = 0; i < 52; i++) {
            if (sM[i] < tM[i]) {
                return false;
            }
        }
        return true;
    }

}