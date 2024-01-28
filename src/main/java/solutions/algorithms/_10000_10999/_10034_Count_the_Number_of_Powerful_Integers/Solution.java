package solutions.algorithms._10000_10999._10034_Count_the_Number_of_Powerful_Integers;

class Solution {

    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {

        long sLong = Long.parseLong(s);

        char[] finishLimit = String.valueOf(finish).toCharArray();
        int[] intF = new int[finishLimit.length];

        for (int i = 0; i < finishLimit.length; i++) {
            int v = finishLimit[i] - '0';
            intF[i] = v;
        }

        char[] startLimit = String.valueOf(start).toCharArray();
        int[] intS = new int[startLimit.length];

        for (int i = 0; i < startLimit.length; i++) {
            int v = startLimit[i] - '0';
            intS[i] = v;
        }

        long count1 = 0;
        if (intF.length >= s.length()) {
            if (intF.length == s.length()) {
                if (sLong <= finish) {
                    count1 = 1;
                }
            } else {
                count1 = countFinish(intF, limit, s, finish, true);
            }
        }
        long count2;
        if (intS.length <= s.length()) {
            if (start - 1 < Long.parseLong(s)) {
                count2 = 0;
            } else {
                count2 = 1;
            }
        } else {
            count2 = countFinish(intS, limit, s, start - 1, false);
        }
        return count1 - count2;
    }

    long countFinish(int[] val, int limit, String s, long finish, boolean forFinish) {

        int first = val[0];
        long withLim;
        long withoutLim;
        int lim = Math.min(first, limit);
        if (first > limit) {
            withLim = 0;
            withoutLim = (lim + 1) * countForLimit(val, limit, 1, false, s.length(), s, finish, forFinish);
        } else {
            withLim = countForLimit(val, limit, 1, true, s.length(), s, finish, forFinish);
            withoutLim = (lim) * countForLimit(val, limit, 1, false, s.length(), s, finish, forFinish);
        }

        return withLim + withoutLim;
    }

    long countForLimit(int[] val, int limit, int idx, boolean withLimit, int sSize, String s, long finish, boolean forFinish) {
        if (idx == val.length - sSize) { //  all indices handled
            if (withLimit) {
                // check if last fits
                StringBuilder finalStr = new StringBuilder();
                for (int i = 0; i < val.length - sSize; i++) {
                    var v = val[i];
                    if (v <= limit) {
                        finalStr.append((char) (v + 48));
                    }
                }
                long toCheck = Long.parseLong(finalStr + s);
                if (forFinish && toCheck > finish || (!forFinish && toCheck > finish)) {
                    return 0;
                }
            }
            return 1;
        }

        // with limit
        if (withLimit) {
            var lim = Math.min(val[idx], limit);
            long with;
            if (val[idx] > limit) {
                return (lim + 1) * countForLimit(val, limit, idx + 1, false, sSize, s, finish, forFinish);
            } else {
                with = countForLimit(val, limit, idx + 1, true, sSize, s, finish, forFinish);
                long without = (lim) * countForLimit(val, limit, idx + 1, false, sSize, s, finish, forFinish);
                return with + without;
            }

        } else {
            return (limit + 1) * countForLimit(val, limit, idx + 1, false, sSize, s, finish, forFinish);
        }
    }
}
