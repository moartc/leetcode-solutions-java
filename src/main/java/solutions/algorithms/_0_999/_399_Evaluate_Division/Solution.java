package solutions.algorithms._0_999._399_Evaluate_Division;

import java.util.*;

class Solution {

    /*
    some notes:
    1. if I have a result for a/b and a result for c/b, I can calculate a/c, because (a/b)/(c/b) = a/b * b/c which equals a/c
    2. if I have a/b and b/c and need to calculate a/c, then a/c = a/b * b/c = (a/b)/(c/b), I don't have c/b, but because I have b/c,
     I can get it by inversion: 1/(b/c)
    3. if the same value appears in both the numerator and the denominator, it can be cancelled out

    example:
    a / b = 2
    b / c = 3
    q:
    a/c -> I need to find either a/c directly, or a/x or x/a and c/x and x/c (where 'x' is any variable)
           then I compute: (a/x)/(c/x) -> here I can use (a/b)/(c/b) = 2/(1/3) = 6
    b/a -> just 1/(a/b) = 1/2
    a/e -> impossible, return = -1
    a/a -> since a/b = 2, a cannot be 0, so a/a = 1
    x/x -> no data = -1

    the description is unclear. I don’t know if 'ab' can be constructed from values 'a' and 'b' or not.
    I assume it can’t, which makes the problem easier

    update: it might make sense to store every char to all its connections instead of all pairs as a single entry
    I am changing it

    update: failed on the case where there is no direct connection - testcase 4
    I will add some bfs.

    update: revisited - I think it's simpler now.
     */
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {


        Map<String, Map<String, Double>> map = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            List<String> eq = equations.get(i);
            double value = values[i];
            Map<String, Double> newHashMap1 = map.getOrDefault(eq.get(0), new HashMap<>());
            newHashMap1.put(eq.get(1), value);
            Map<String, Double> newHashMap2 = map.getOrDefault(eq.get(1), new HashMap<>());
            newHashMap2.put(eq.get(0), 1 / value);
            map.put(eq.get(0), newHashMap1);
            map.put(eq.get(1), newHashMap2);
        }

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            double answer = findAnswer(query.get(0), query.get(1), map, 1.0, new HashSet<>());
            result[i] = answer;
        }

        return result;
    }

    double findAnswer(String a, String b, Map<String, Map<String, Double>> map, double currentRes, Set<String> visited) {

        visited.add(a);
        if (!map.containsKey(a)) {
            return -1;
        } else {
            Map<String, Double> stringDoubleMap = map.get(a);
            if (stringDoubleMap.containsKey(b)) {
                Double v = stringDoubleMap.get(b);
                return currentRes * v;
            } else {
                for (Map.Entry<String, Double> entry : stringDoubleMap.entrySet()) {
                    String key = entry.getKey();
                    Double value = entry.getValue();
                    if (!visited.contains(key)) {
                        double answer = findAnswer(key, b, map, currentRes * value, visited);
                        if (answer != -1) {
                            return answer;
                        }
                    }
                }
            }
        }
        return -1;
    }
}