package solutions.algorithms._1000_1999._1888_Minimum_Number_of_Flips_to_Make_the_Binary_String_Alternating;

class Solution {
    public int minFlips(String s) {

        // the only case when moving back make sense is when I have 11 at the beginning and 00 at the end
        // or 00 at the beginning and 11 at the end
        char[] charArray = s.toCharArray();
        // 1 1 1 0 0 0
        // 1 1 0 0 0 1
        // even1 odd 0 -> 2
        // even0 odd 1 -> 4
        // so get the better sum and check how many are missing
        int even1 = 0;
        int even0 = 0;
        int odd1 = 0;
        int odd0 = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(i % 2 == 0) { // even
                if(charArray[i] == '1') {
                    even1++;
                } else {
                    even0++;
                }
            } else {
                if(charArray[i] == '1') {
                    odd1++;
                } else {
                    odd0++;
                }
            }
        }
        // I always move idx 0, just moving here index
        int bestFound = Integer.MAX_VALUE;
        for (char c : charArray) {
            if (c == '1') {
                int prevOdd0 = odd0;
                int prevOdd1 = odd1;
                int prevEven0 = even0;
                int prevEven1 = even1;
                even0 = prevOdd0;
                even1 = prevOdd1;
                odd0 = prevEven0;
                odd1 = prevEven1;
                if (charArray.length % 2 != 0) {
                    odd1--;
                    even1++;
                }
            } else {
                int prevOdd0 = odd0;
                int prevOdd1 = odd1;
                int prevEven0 = even0;
                int prevEven1 = even1;
                even0 = prevOdd0;
                even1 = prevOdd1;
                odd0 = prevEven0;
                odd1 = prevEven1;
                if (charArray.length % 2 != 0) {
                    odd0--;
                    even0++;
                }
            }
            int stringSize = s.length();
            int even1PlusOdd0 = even1 + odd0;
            int even0PlusOdd1 = even0 + odd1;
            int better = Math.max(even0PlusOdd1, even1PlusOdd0);
            bestFound = Math.min(bestFound, stringSize - better);
        }
        return bestFound;
    }
}