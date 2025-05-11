package solutions.algorithms._0_999._853_Car_Fleet;

import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        if (position.length < 2) {
            return 1;
        }

        Map<Integer, Integer> positionToSpeed = new HashMap<>(speed.length);

        for (int i = 0; i < position.length; i++) {
            int pos = position[i];
            int sp = speed[i];
            positionToSpeed.put(pos, sp);
        }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(positionToSpeed);

        // target - position = distance to travel
        // distance to travel / speed = time of ride
        List<Double> listOfTimes = new ArrayList<>(position.length);

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int pos = entry.getKey();
            int sp = entry.getValue();
            int distToTravel = target - pos;
            double timeNeeded = distToTravel / (double) sp;
            listOfTimes.add(timeNeeded);
        }

        int numberOfFleets = 1;
        int index = listOfTimes.size() - 2;
        double current = listOfTimes.get(listOfTimes.size() - 1);
        while (index >= 0) {
            double prev = listOfTimes.get(index);
            if (prev <= current) {
                index--;
            } else {
                current = prev;
                numberOfFleets++;
            }
        }
        return numberOfFleets;
    }
}