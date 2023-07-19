package solutions.algorithms._1275_Find_Winner_on_a_Tic_Tac_Toe_Game;

class Solution {
    public String tictactoe(int[][] moves) {

        boolean[] aPlayer = new boolean[9];
        boolean[] bPlayer = new boolean[9];

        for (int i = 0; i < moves.length; i++) {
            int idx = getNum(moves[i]);
            if (i % 2 == 0) {
                aPlayer[idx] = true;
            } else {
                bPlayer[idx] = true;
            }
        }

        if (isWinner(aPlayer)) {
            return "A";
        } else if (isWinner(bPlayer)) {
            return "B";
        } else if (moves.length == 9) {
            return "Draw";
        } else {
            return "Pending";
        }
    }

    boolean isWinner(boolean[] moves) {
        if (moves[0] && moves[1] && moves[2]) {  // 1st row
            return true;
        } else if (moves[3] && moves[4] && moves[5]) { // 2nd row
            return true;
        } else if (moves[6] && moves[7] && moves[8]) { // 3rd row
            return true;
        } else if (moves[0] && moves[3] && moves[6]) { // 1st column
            return true;
        } else if (moves[1] && moves[4] && moves[7]) { // 2nd column
            return true;
        } else if (moves[2] && moves[5] && moves[8]) { // 3rd column
            return true;
        } else if (moves[0] && moves[4] && moves[8]) { // left right down
            return true;
        } else if (moves[2] && moves[4] && moves[6]) { // left right up
            return true;
        }
        return false;
    }

    int getNum(int[] arr) {
        if (arr[0] == 0 && arr[1] == 0) {
            return 0;
        } else if (arr[0] == 0 && arr[1] == 1) {
            return 1;
        } else if (arr[0] == 0 && arr[1] == 2) {
            return 2;
        } else if (arr[0] == 1 && arr[1] == 0) {
            return 3;
        } else if (arr[0] == 1 && arr[1] == 1) {
            return 4;
        } else if (arr[0] == 1 && arr[1] == 2) {
            return 5;
        } else if (arr[0] == 2 && arr[1] == 0) {
            return 6;
        } else if (arr[0] == 2 && arr[1] == 1) {
            return 7;
        } else { // 2, 2
            return 8;
        }
    }
}