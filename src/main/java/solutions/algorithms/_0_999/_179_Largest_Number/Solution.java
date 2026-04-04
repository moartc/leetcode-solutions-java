package solutions.algorithms._0_999._179_Largest_Number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String largestNumber(int[] nums) {

        List<String> listOfString = new ArrayList<>();
        for (int num : nums) {
            listOfString.add(String.valueOf(num));
        }

        Collections.sort(listOfString, (o1, o2) -> {
            String f = o1 + o2;
            String s = o2 + o1;
            return s.compareTo(f);
        });

        if (listOfString.get(0).equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : listOfString) {
            sb.append(s);
        }
        return sb.toString();
    }
}