package solutions.algorithms._0_999._815_Bus_Routes;

import java.util.*;

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {

        if (source == target) {
            return 0;
        }
        Map<Integer, Set<Integer>> routeToStops = new HashMap<>();
        Map<Integer, List<Integer>> stopToRoutes = new HashMap<>();
        int maxRoute = 0;
        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            Set<Integer> stops = routeToStops.getOrDefault(i, new HashSet<>());
            for (int r : route) {
                List<Integer> routeIndices = stopToRoutes.getOrDefault(r, new ArrayList<>());
                routeIndices.add(i);
                stopToRoutes.put(r, routeIndices);
                maxRoute = Math.max(maxRoute, r);
                stops.add(r);
            }
            routeToStops.put(i, stops);
        }
        // route, round
        Queue<int[]> q = new LinkedList<>();
        List<Integer> startingRoutes = stopToRoutes.get(source);
        int[] visitedRoutes = new int[routes.length];
        Arrays.fill(visitedRoutes, Integer.MAX_VALUE);
        if (startingRoutes == null) {
            return -1;
        } else {
            for (int r : startingRoutes) {
                q.add(new int[]{r, 1});
                visitedRoutes[r] = 1;
            }
        }
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currRoute = curr[0];
            int currRound = curr[1];
            if (routeToStops.get(currRoute).contains(target)) {
                return currRound;
            }
            // first visit all at the same route
            for (int stops : routes[currRoute]) {
                List<Integer> possibleRoutes = stopToRoutes.get(stops);
                for (Integer singleRoute : possibleRoutes) {
                    if (visitedRoutes[singleRoute] > currRound + 1) {
                        visitedRoutes[singleRoute] = currRound + 1;
                        q.add(new int[]{singleRoute, currRound + 1});
                    }
                }
            }
        }
        return -1;
    }

}