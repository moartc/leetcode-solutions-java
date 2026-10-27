package solutions.algorithms._3000_3999._3963_Create_Grid_With_Exactly_One_Path;

class Solution {
    /*
    I can start at 0,0, go all the way down and then go right
    these cells have to remain empty
     */
    public String[] createGrid(int m, int n) {

        String[] answer = new String[m];
        for (int y = 0; y < m; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < n; x++) {
                if (x == 0 || y == m - 1) {
                    sb.append('.');
                } else {
                    sb.append("#");
                }
            }
            answer[y] = sb.toString();
        }
        return answer;
    }
}