package solutions.algorithms._0_999._287_Find_the_Duplicate_Number;

class Solution {

    /*
    size: n + 1
    integers: 1 .. n

    for n = 3
    size 4 and integers 1, 2, 3

    f.ex: 2, 3, 1, 3

    I would never solve it without googling.
    Floyd's Cycle Detection
     */

    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        int foundMeetingPoint;
        while (true) {

            int nextSlow = nums[slow];
            int nextFast = nums[nums[fast]];
            slow = nextSlow;
            fast = nextFast;
            if (slow == fast) {
                foundMeetingPoint = fast;
                break;
            }
        }
        // now move both by 1
        slow = 0;
        while (foundMeetingPoint != slow) {
            foundMeetingPoint = nums[foundMeetingPoint];
            slow = nums[slow];
        }
        return slow;
    }
}

/*
2 1 3 3

 */