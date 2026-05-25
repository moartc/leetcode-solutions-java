package solutions.algorithms._0_999._756_Pyramid_Transition_Matrix;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    Set<String> visited;

    public boolean pyramidTransition(String bottom, List<String> allowed) {

        visited = new HashSet<>();
        return canBuild(0, bottom, allowed, new StringBuilder());
    }

    // handles currentIdx and one on the right
    boolean canBuild(int currentIdx, String expected, List<String> allowed, StringBuilder sb) {

        if (visited.contains(expected) && currentIdx == 0) {
            return false;
        }

        if (expected.length() == 1) {
            return true;
        }
        if (currentIdx == expected.length() - 1) { // the last
            // I've built a bottom, so I can build top
            visited.add(expected);
            return canBuild(0, sb.toString(), allowed, new StringBuilder());
        }

        int first = expected.charAt(currentIdx);
        int second = expected.charAt(currentIdx + 1);

        for (String allowedString : allowed) {
            if (allowedString.charAt(0) == first && allowedString.charAt(1) == second) {
                sb.append(allowedString.charAt(2));
                if (canBuild(currentIdx + 1, expected, allowed, sb)) {
                    return true;
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        visited.add(expected);
        return false;
    }
}