package solutions.algorithms._1000_1999._1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary;

class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (int s : salary) {
            total += s;
            if(min > s) {
                min = s;
            }
            if(max < s) {
                max = s;
            }
        }
        return (total - min - max) / (double)(salary.length - 2);
    }
}