package solutions.algorithms._0_999._332_Reconstruct_Itinerary;

import java.util.*;

class Solution {

    /*
    It's an Eulerian path, but it doesn't really matter

    Idea (basically DFS + post-order):
    Start at "JFK".
    While there are outgoing edges, keep following the lexicographically smallest unused edge.
    When I reach a node with no more unused edges, add that node to the result list.

    update: in the adjecency list, nodes are sorted
    and I have to reverse the final list at the end
    */
    public List<String> findItinerary(List<List<String>> tickets) {
        // build adjecency list
        Map<String, PriorityQueue<String>> adjList = new HashMap<>();

        for (List<String> ticket : tickets) {
            String start = ticket.get(0);
            String end = ticket.get(1);
            PriorityQueue<String> neighbours = adjList.getOrDefault(start, new PriorityQueue<>());
            neighbours.add(end);
            adjList.put(start, neighbours);
        }
        // start with JFK
        List<String> finalList = new ArrayList<>();
        visit("JFK", adjList, finalList);
        // I have to reverse it
        Collections.reverse(finalList);
        return finalList;


    }

    // I am doing it recursively
    void visit(String startAirport, Map<String, PriorityQueue<String>> adjList, List<String> finalList) {
        PriorityQueue<String> list = adjList.get(startAirport);
        if (list != null) {
            while (!list.isEmpty()) {
                String neighbour = list.poll();
                visit(neighbour, adjList, finalList);
            }
        }
        // it's empty, so I can add it to the list
        finalList.add(startAirport);
    }

}