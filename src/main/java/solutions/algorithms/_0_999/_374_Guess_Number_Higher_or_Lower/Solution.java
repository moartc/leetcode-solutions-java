package solutions.algorithms._0_999._374_Guess_Number_Higher_or_Lower;

/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 * 1 if num is lower than the picked number
 * otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {

    /*
    so n is the upper limit
     */
    public int guessNumber(int n) {

        int min = 1;
        int max = n;
        while (true) {
            int mid = min + (max - min) / 2;
            int resp = guess(mid);
            if (resp == 0) {
                return mid;
            } else if (resp == -1) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
    }
}


class GuessGame {

    // implementation for tests
    int number;

    int guess(int num) {
        if (num > number) {
            return -1;
        } else if (num < number) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }
}