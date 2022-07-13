package solutions.algorithms._22_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> toCollect = new ArrayList<>();
        generate(new StringBuilder(), n, 0, 0, toCollect);
        return toCollect;
    }

    void generate(StringBuilder current, int n, int opens, int closes, List<String> toCollect) {
        if (closes == n) {
            toCollect.add(current.toString());
        } else {
            boolean willOpen = opens < n;
            if (opens > closes) {
                if(willOpen) {
                    StringBuilder newSb = new StringBuilder(current);
                    newSb.append(')');
                    generate(newSb, n, opens, closes + 1, toCollect);
                } else {
                    current.append(')');
                    generate(current, n, opens, closes + 1, toCollect);
                }
            }
            if (willOpen) {
                current.append('(');
                generate(current, n, opens + 1,closes, toCollect);
            }
        }
    }
}