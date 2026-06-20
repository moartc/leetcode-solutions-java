package solutions.algorithms._1000_1999._1840_Maximum_Building_Height;

import java.util.Arrays;

class Solution {

    /*
    Since I can increase the size by 1, I need a lot of space to make a tall building
    The height is limited either by the starting (1) building or by any other building with a restriction
    I could check each range: from 1 to the 1st restriction, from the 1st restriction to the 2nd, ...,
    from the last restriction to the last possible place (n)
    and check how tall the tallest building can be there.
    finding the max:
    for 1 and 1 on both sides I can grow towards the middle, and then I need to go down
    1 2 3 2 1 or, for example 1 2 2 1
    for 1 and 4:
    1 2 3 4 for distance 2
    1 2 3 4 5 4 for distance 4
    1 2 3 4 5 6 5 4 for distance 6
    I guess "impossible" ranges are not possible, like 1 and 4 with only 1 space
    the formula would be:
    for equal restrictions: find the distance to the middle, and the tallest building is restriction + this distance
    for unequal restrictions: make the restrictions equal -> move the lower one up until they are equal, then use the first formula

    also: because I consider each space between 2 restrictions separately, the restriction height (on both the left and right) might
    not actually be reachable because there might not be enough space to grow to the restriction height.
    I need to do it in both directions
    So first I have to calculate the real max reachable height, and then use the lower of the real max and the restriction

     */
    public int maxBuilding(int n, int[][] restrictions) {

        Arrays.sort(restrictions, (o1, o2) -> o1[0] - o2[0]);

        int maxFound = Integer.MIN_VALUE;

        int[] prevRest = new int[]{1, 0};

        for (int[] restriction : restrictions) {
            int currentMax = restriction[1];
            int currentIndex = restriction[0];
            int prevIndex = prevRest[0];
            int prevMax = prevRest[1];
            int dist = currentIndex - prevIndex;
            int realMax = dist + prevMax;
            restriction[1] = Math.min(realMax, currentMax);
            prevRest = restriction;
        }

        for (int i = restrictions.length - 2; i >= 0; i--) {
            int[] restriction = restrictions[i];
            prevRest = restrictions[i + 1];
            int currentMax = restriction[1];
            int currentIndex = restriction[0];
            int prevIndex = prevRest[0];
            int prevMax = prevRest[1];
            int dist = prevIndex - currentIndex;
            int realMax = dist + prevMax;
            restriction[1] = Math.min(realMax, currentMax);
        }

        // restriction from the beginning
        prevRest = new int[]{1, 0};
        int i = 0;
        while (i < restrictions.length) {
            int[] currentRest = restrictions[i];
            int leftIdx = prevRest[0];
            int rightIdx = currentRest[0];
            int leftSize = prevRest[1];
            int rightSize = currentRest[1];

            // make them equal
            if (leftSize < rightSize) {
                leftIdx += (rightSize - leftSize);
            } else if (leftSize > rightSize) {
                rightIdx -= (leftSize - rightSize);
            }

            // here both restrictions are equal the higher one
            int midIndex = (leftIdx + rightIdx) / 2;
            int length = midIndex - leftIdx;
            int max = Math.max(leftSize, rightSize) + length;
            maxFound = Math.max(max, maxFound);
            prevRest = currentRest;
            i++;
        }
        // restriction to the end
        int prevH = prevRest[1];
        int distToTheEnd = n - prevRest[0];
        int maxFromHere = prevH + distToTheEnd;
        maxFound = Math.max(maxFromHere, maxFound);

        return maxFound;
    }
}