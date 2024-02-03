package solutions.algorithms._3000_3999._3024_Type_of_Triangle_II;

class Solution {
    public String triangleType(int[] nums) {

        var a = nums[0];
        var b = nums[1];
        var c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        }
        if (a == b || a == c || b == c) {
            return "isosceles";
        }

        return "scalene";
    }
}