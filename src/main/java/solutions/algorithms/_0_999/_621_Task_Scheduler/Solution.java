package solutions.algorithms._0_999._621_Task_Scheduler;

class Solution {

    // gap n between 2 tasks with the same label

    /*
    notes:

    I can do a frequency map
    then I have something like this
    A A A A A
    B B B B
    C C C
    D D
    E
    F

    so for n = 4
    I can do
    ABCDEFABCD|ABC||AB|||A = 22
    or
    ABCDEABCDFABC||AB|||A  =  21 <- this is better, so I should schedule max frequent task and then fill the gaps with n-1 other tasks

    ex1: A____A____A____A____A
    ex2: AB___AB___AB___AB___AB

    in the first case max is 5
    I have 5 elements and 4 places to fill

    In the second case max is 5 and I have 2 such elements
    number of places to fill (I don't count these from max frequency tasks): (max frequency - 1) * (n+1-numberOfElementWithMax)
    additional tasks from map: all - (max frequency * numberOfElementsWithMax)
    additional waiting: number of places to fill - additional tasks

    -------------------
    Small improvement -> use array instead of map
    and it actually improved from 65% to 82.2%


    */
    public int leastInterval(char[] tasks, int n) {

        int max = 1;
        int[] map = new int[26];
        for (char task : tasks) {
            int idx = task - 65;
            int currentValue = map[idx];
            map[idx] = currentValue + 1;
            if (currentValue + 1 > max) {
                max = currentValue + 1;
            }
        }
        // count how many shares max frequency < O(n)
        int numberOfElementWithMaxFreq = 0;
        for (int value : map) {
            if (value == max) {
                numberOfElementWithMaxFreq++;
            }
        }
        var all = tasks.length;
        // number of elements which should be fill in
        var toFill = (max - 1) * (n + 1 - numberOfElementWithMaxFreq);
        var additionalTasks = all - (max * numberOfElementWithMaxFreq);
        var additionalWaiting = toFill - additionalTasks;
        // additionalWaiting might be negative, int that case get '0'
        return all + (Math.max(additionalWaiting, 0));
    }
}