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
     */
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        Map<String, Map<String, Double>> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            double value = values[i];
            List<String> pair = equations.get(i);
            String f = pair.get(0);
            String s = pair.get(1);
            Map<String, Double> m1 = map.getOrDefault(f, new HashMap<>());
            m1.put(s, value);
            Map<String, Double> m2 = map.getOrDefault(s, new HashMap<>());
            m2.put(f, 1 / value);
            map.put(f, m1);
            map.put(s, m2);
        }
        // at this point I have initial connections

        double[] answer = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String qf = query.get(0);
            String qs = query.get(1);

            if (map.containsKey(qf) && map.containsKey(qs)) {
                Map<String, Double> firstMap = map.get(qf);
                if (firstMap.containsKey(qs)) {
                    // there is a direct connection
                    answer[i] = firstMap.get(qs);
                    continue;
                }
                // try bfs
                Double bfs = bfs(qs, firstMap, map, new HashSet<>());
                if (bfs == Double.MAX_VALUE) {
                    answer[i] = -1;
                } else {
                    answer[i] = bfs;
                }

            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }

    Double bfs(String toFind, Map<String, Double> currentMap, Map<String, Map<String, Double>> wholeMap, Set<String> visited) {

        Queue<Pair> queue = new LinkedList<>();

        for (Map.Entry<String, Double> e : currentMap.entrySet()) {
            queue.add(new Pair(e.getKey(), e.getValue()));
            visited.add(e.getKey());
        }

        while (!queue.isEmpty()) {
            Pair poll = queue.poll();
            if (poll.key.equals(toFind)) {
                return poll.value;
            } else {
                // add all
                for (Map.Entry<String, Double> e : wholeMap.get(poll.key).entrySet()) {
                    if (visited.add(e.getKey())) {
                        queue.add(new Pair(e.getKey(), poll.value * e.getValue()));
                    }
                }
            }
        }
        return Double.MAX_VALUE;
    }

    static class Pair {
        public String key;
        public double value;

        public Pair(String key, double value) {
            this.key = key;
            this.value = value;
        }
    }

}