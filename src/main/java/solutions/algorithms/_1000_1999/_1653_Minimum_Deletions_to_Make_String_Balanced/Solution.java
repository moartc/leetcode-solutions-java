package solutions.algorithms._1000_1999._1653_Minimum_Deletions_to_Make_String_Balanced;

class Solution {
    public int minimumDeletions(String s) {
        char[] cArr = s.toCharArray();
        int totalA = 0;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == 'a') {
                totalA++;
            }
        }
        int minChange = Integer.MAX_VALUE;
        int aCtr = 0;
        int bCtr = 0;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == 'a') {
                aCtr++;
            } else {
                bCtr++;
            }
            int possibleAs = i + 1;
            int missingAs = possibleAs - aCtr;
            int elementsOnTheRight = cArr.length - 1 - i;
            int bOnTheRight = cArr.length - totalA - bCtr;
            int totalToChange = missingAs + (elementsOnTheRight - bOnTheRight);
            minChange = Math.min(minChange, totalToChange);
        }
        // missing case where I have only bs
        minChange = Math.min(totalA, minChange);
        return minChange;
    }

}