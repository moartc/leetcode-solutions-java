package solutions.algorithms._0_999._787_Cheapest_Flights_Within_K_Stops;

import java.util.Arrays;

class Solution {

    /*
    It's Dijkstra-like, with additional dimension for number of steps

    update: it beats only 17%
    I am switching to Bellman-Ford
    and that's actually fast - it beats 99.25%
     */
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;

        int ctr = 0;
        while (ctr <= k) {
            /*
            from wiki:
            for each edge (u, v) with weight w in edges do
                if distance[u] + w < distance[v] then
                    distance[v] := distance[u] + w
             */
            int[] temp = Arrays.copyOf(distance, distance.length);
            for (int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];
                if (distance[u] < temp[v] - w) {
                    temp[v] = distance[u] + w;
                }
            }
            distance = temp;
            ctr++;
        }
        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }


    // Here is the initial Dijkstra solution:
    /*
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // add 1, because I am counting a total number of visited nodes (not only stops)
        k += 1;
        // best per node and number of steps
        int[][] distances = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(distances[i], Integer.MAX_VALUE);
        }

        List<int[]>[] adjList = new ArrayList[n];

        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int dist = flight[2];
            if (adjList[from] == null) {
                adjList[from] = new ArrayList<>();
            }
            adjList[from].add(new int[]{to, dist});
        }

        distances[src][0] = 0;

        // node, current number of steps, dist
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[2] == o2[2]) {
                    return o1[1] -  o2[1];
                } else {
                    return o1[2] -  o2[2];
                }
            }
        });

        pq.add(new int[]{src, 0, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int noOfSteps = current[1];
            int dist = current[2];

            if (node == dst) {
                return dist;
            }

            if (adjList[node] != null) {
                for (int[] neighbour : adjList[node]) {
                    int neighbourNode = neighbour[0];
                    int neighbourCost = neighbour[1];
                    // I can visit it only if the current number of steps + 1 <= k
                    if (noOfSteps + 1 > k) {
                        continue;
                    }
                    if (distances[neighbourNode][noOfSteps + 1] > dist + neighbourCost) {
                        distances[neighbourNode][noOfSteps + 1] = dist + neighbourCost;
                        pq.add(new int[]{neighbourNode, noOfSteps + 1, distances[neighbourNode][noOfSteps + 1]});
                    }
                }
            }
        }
        return -1;
    }
    */
}