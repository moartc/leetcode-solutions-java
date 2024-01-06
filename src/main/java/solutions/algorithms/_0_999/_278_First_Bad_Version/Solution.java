package solutions.algorithms._0_999._278_First_Bad_Version;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        return search(1,n);
    }

    private int search(int left, int right) {
        if (left + 1 >= right) {
            if (isBadVersion(left)) return left;
            else return right;
        }
        int middle = (left + (right - left) / 2);
        boolean isBad = isBadVersion(middle);
        if (isBad) {
            return search(left, middle);
        } else {
            return search(middle, right);
        }
    }

    Solution(int bad) {
        super(bad);
    }
}

class VersionControl {
    private final int bad;
    int counter = 0;
    VersionControl(int bad) {
        this.bad = bad;
    }

    public boolean isBadVersion(int n) {
        System.out.println("call " + ++counter );
        return n >= bad;
    }
}