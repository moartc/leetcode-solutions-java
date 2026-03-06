package solutions.algorithms._1000_1999._1784_Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones;

class Solution {
    /*
     Just iterate and count 'segments'. Return false when I start the 2nd one
     */
    public boolean checkOnesSegment(String s) {

        boolean canBeNewSegment = true;
        int segmentCounter = 0;

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c1 = charArray[i];
            if (c1 == '1') {
                if (canBeNewSegment) {
                    canBeNewSegment = false;
                    segmentCounter++;
                    if (segmentCounter > 1) {
                        return false;
                    }
                } else {
                    // do nothing, it's still the same segment
                }
            } else {
                canBeNewSegment = true;
            }
        }
        return true;
    }
}