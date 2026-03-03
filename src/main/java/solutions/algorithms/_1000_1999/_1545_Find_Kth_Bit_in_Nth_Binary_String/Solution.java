package solutions.algorithms._1000_1999._1545_Find_Kth_Bit_in_Nth_Binary_String;

class Solution {

    /*
    It grows like this
    1
    1 + 1 + 1
    3 + 1 + 3
    Size of Sn = 2*(size of Sn-1)+1
    for n=4 the size is: 15, in general it's (2^n)-1
    its bits:
    0111001 1
    0110001
    if I want to find bit 11 - it's 5th from the right, and it's the same as 5th from the left for size 7
    split once more
    011 0
    001
    Take the first from the left for size 3, split once more - first from the left
    ---
    algorithm:
    get the full size and find the middle, if k is in the second half, get its position after the middle and jump to the same position
    before the middle, store the number of jumps (its value is as it is at this position but reversed)
    find the middle again and repeat.
    If the number is on the left side - keep it .
    at the end, I should have only one value and the number of jumps - if that's even -> the number is 0, otherwise it's 1

    update: I had to add an additional case for k == middle
     */
    public char findKthBit(int n, int k) {
        //
        k = k - 1;
        int size = (int) (Math.pow(2, n) - 1);
        int numberOfJumps = 0;
        while (size != 1) {
            int middle = size / 2;
            if (k == middle) {
                if (numberOfJumps % 2 == 0) {
                    return '1';
                } else {
                    return '0';
                }
            } else if (k < middle) {
                size = middle;
            } else {
                numberOfJumps++;
                size = middle;
                int positionAfterMiddle = k - middle;
                k = middle - positionAfterMiddle;
            }
        }
        if (numberOfJumps % 2 == 0) {
            return '0';
        } else {
            return '1';
        }
    }
}