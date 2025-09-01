package solutions.algorithms._0_999._846_Hand_of_Straights;

import java.util.*;

class Solution {

    /*
    First I can check if the hand can be divided into groupSize groups of groupSize cards, if not - return false

    Then I could sort the hand and start rearranging
    after sorting my hand is:
    1, 2, 2, 3, 3, 4, 6, 7, 8

    I can track for each group, last added card and number of still remaining cards

    The code is rather messy, but it beats ~75%.

     */
    public boolean isNStraightHand(int[] hand, int groupSize) {

        int numberOfCards = hand.length;
        if (numberOfCards % groupSize != 0) {
            return false;
        }

        int maxNumbOfGroups = hand.length / groupSize;
        Arrays.sort(hand);

        // last seen value to the number of remaining in the group
        // it's a list because I can have the same value in 2 different groups at the same time
        Map<Integer, List<Integer>> map = new HashMap<>();

        int numberOfCreatedGroups = 0;
        for (int i = 0; i < hand.length; i++) {
            int val = hand[i];
            if (i == 0) {
                // nothing added yet
                addToMap(map, val, groupSize);
                numberOfCreatedGroups++;
            } else {
                // try to find in map, the previous value
                List<Integer> valFromMap = map.get(val - 1);
                if (valFromMap != null) {
                    // there is a list, try to find any with val > 0
                    int idxFound = -1;
                    int valFound = -1;
                    for (int j = 0; j < valFromMap.size(); j++) {
                        if (valFromMap.get(j) > 0) {
                            idxFound = j;
                            valFound = valFromMap.get(j);
                            break;
                        }
                    }
                    if (idxFound != -1) {
                        // remove from here and add with a different value
                        valFromMap.remove(idxFound);
                        if (valFromMap.size() == 0) {
                            map.remove(val - 1);
                        }
                        // map can exist, let's check it
                        List<Integer> integers = map.get(val);
                        if (integers != null) {
                            integers.add(valFound - 1);
                        } else {
                            addToMap(map, val, valFound);
                        }
                    } else {
                        // add new group
                        numberOfCreatedGroups++;
                        if (numberOfCreatedGroups > maxNumbOfGroups) {
                            return false;
                        }

                        List<Integer> integers = map.get(val);
                        if (integers != null) {
                            integers.add(groupSize - 1);
                        } else {
                            addToMap(map, val, groupSize);
                        }
                    }
                } else {
                    // else add a new group
                    numberOfCreatedGroups++;
                    if (numberOfCreatedGroups > maxNumbOfGroups) {
                        return false;
                    }

                    List<Integer> integers = map.get(val);
                    if (integers != null) {
                        integers.add(groupSize - 1);
                    } else {
                        addToMap(map, val, groupSize);
                    }
                }
            }
        }
        // no problem found, it's correct
        return true;
    }

    private void addToMap(Map<Integer, List<Integer>> map, int val, int groupSize) {
        List<Integer> newList = new ArrayList<>();
        newList.add(groupSize - 1);
        map.put(val, newList);
    }
}