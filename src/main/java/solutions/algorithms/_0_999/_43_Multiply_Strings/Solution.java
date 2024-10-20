package solutions.algorithms._0_999._43_Multiply_Strings;

import java.util.ArrayList;
import java.util.List;

// todo to improve
//  Runtime 10ms        Beats 23.97%
//  Memory  45.25MB     Beats 5.49%
class Solution {
    public String multiply(String num1, String num2) {


        List<List<Integer>> listList = new ArrayList<>(num1.length() * num2.length());
        String longer;
        String shorter;
        if (num1.length() >= num2.length()) {
            longer = num1;
            shorter = num2;
        } else {
            longer = num2;
            shorter = num1;
        }

        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int ctr = 0;
        int rest = 0;
        for (int i = shorter.length() - 1; i >= 0; i--) {
            int f = shorter.charAt(i) - 48;
            listList.add(new ArrayList<>());

            // add zeros
            for (int k = 0; k < ctr; k++) {
                listList.get(ctr).add(0);
            }

            for (int j = longer.length() - 1; j >= 0; j--) {
                int s = longer.charAt(j) - 48;

                int mult = f * s;
                int resWithRest = mult + rest;
                rest = resWithRest / 10;
                int val = resWithRest % 10;
                listList.get(ctr).add(val);
            }
            if(rest != 0) {
                listList.get(ctr).add(rest);
                rest = 0;
            }
            ctr++;
        }

        int val = 0;
        int rest2 = 0;


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < listList.get(listList.size() - 1).size() ; i++) { // iterate max array elements

            for (List<Integer> integers : listList) {
                if (integers.size() - 1 >= i)
                    val += integers.get(i);
            }

            int valWithRest = val + rest2;
            int toPrint = (valWithRest) % 10;
            rest2 = valWithRest / 10;
            val = 0;
            sb.append(toPrint);

        }
        if (rest2 > 0) {
            sb.append(rest2);
        }
        var str  = sb.reverse().toString();
        if(str.charAt(0) == '0') {
            return str.substring(1,str.length());
        } else  {
            return str;
        }

    }
}