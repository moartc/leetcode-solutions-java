package solutions.algorithms._0_999._12_Integer_to_Roman;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String intToRoman(int num) {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(1, "I"));
        list.add(new Pair(4, "IV"));
        list.add(new Pair(5, "V"));
        list.add(new Pair(9, "IX"));
        list.add(new Pair(10, "X"));
        list.add(new Pair(40, "XL"));
        list.add(new Pair(50, "L"));
        list.add(new Pair(90, "XC"));
        list.add(new Pair(100, "C"));
        list.add(new Pair(400, "CD"));
        list.add(new Pair(500, "D"));
        list.add(new Pair(900, "CM"));
        list.add(new Pair(1000, "M"));

        int d1 = num % 10;
        int d2 = num % 100 / 10 * 10;
        int d3 = num % 1000 / 100 * 100;
        int d4 = num % 10000 / 1000 * 1000;

        StringBuilder sb = new StringBuilder();
        buildPart(d4, list, sb);
        buildPart(d3, list, sb);
        buildPart(d2, list, sb);
        buildPart(d1, list, sb);
        return sb.toString();
    }

    StringBuilder buildPart(int d, List<Pair> map, StringBuilder sb) {
        if (d == 0) {
            return sb;
        }
        for (int i = map.size() - 1; i >= 0; i--) {
            Pair pair = map.get(i);
            if (pair.k <= d) {
                sb.append(pair.v);
                int newValue = d - pair.k;
                return buildPart(newValue, map, sb);
            }
        }
        return sb;
    }

    static class Pair {
        public int k;
        public String v;

        public Pair(int k, String v) {
            this.k = k;
            this.v = v;
        }
    }
}

