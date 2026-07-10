package solutions.algorithms._0_999._401_Binary_Watch;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {

        List<String> allVals = new ArrayList<>();
        for (int turnedHours = 0; turnedHours <= turnedOn; turnedHours++) {
            int turnedMins = turnedOn - turnedHours;

            List<Integer> possibleHours = possibleHours(turnedHours);
            List<Integer> possibleMinutes = possibleMinutes(turnedMins);

            for (Integer hour : possibleHours) {
                String hString = String.valueOf(hour);
                for (Integer minute : possibleMinutes) {
                    String mString = minute < 10 ? "0" + minute : String.valueOf(minute);
                    allVals.add(hString + ":" + mString);
                }
            }
        }
        return allVals;
    }


    List<Integer> possibleHours(int n) {

        int[] bin = new int[]{8, 4, 2, 1};
        List<Integer> allHours = new ArrayList<>();
        generate(0, n, bin, allHours, 0, 11);
        return allHours;
    }

    List<Integer> possibleMinutes(int n) {

        int[] bin = new int[]{32, 16, 8, 4, 2, 1};
        List<Integer> allMins = new ArrayList<>();
        generate(0, n, bin, allMins, 0, 59);
        return allMins;
    }

    private void generate(int currentIdx, int numbsToUse, int[] bin, List<Integer> allGenerate, int currentValue, int maxToGenerate) {
        if (numbsToUse == 0 && currentValue <= maxToGenerate) {
            allGenerate.add(currentValue);
            return;
        }
        if (currentIdx >= bin.length) {
            return;
        }
        boolean canSkip = currentIdx + numbsToUse < bin.length;
        if (canSkip) {
            generate(currentIdx + 1, numbsToUse, bin, allGenerate, currentValue, maxToGenerate);
        }
        generate(currentIdx + 1, numbsToUse - 1, bin, allGenerate, currentValue + bin[currentIdx], maxToGenerate);
    }
}