package solutions.algorithms._3000_3999._3783_Mirror_Distance_of_an_Integer;

class Solution {
    public int mirrorDistance(int n) {

        int reversed = 0;
        int original = n;
        while (original != 0) {
            reversed *= 10;
            int rem = original % 10;
            reversed += rem;
            original /= 10;
        }
        return Math.abs(reversed - n);
    }
}